package com.myntra.android.myntratrendonsearch.ui.trending

import android.annotation.SuppressLint
import android.content.pm.PackageManager
import android.os.Bundle
import android.os.Environment
import android.os.Handler
import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.camera.core.CameraSelector
import androidx.camera.core.ImageAnalysis
import androidx.camera.core.ImageCapture
import androidx.camera.core.Preview
import androidx.camera.extensions.HdrImageCaptureExtender
import androidx.camera.lifecycle.ProcessCameraProvider
import androidx.camera.view.PreviewView
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.lifecycle.LifecycleOwner
import com.myntra.android.myntratrendonsearch.R
import com.myntra.android.myntratrendonsearch.util.Constants
import com.myntra.android.myntratrendonsearch.util.DataProcessor
import com.myntra.android.myntratrendonsearch.util.FunctionUtils
import kotlinx.android.synthetic.main.activity_try_item.*
import java.io.File
import java.util.concurrent.ExecutionException
import java.util.concurrent.Executor
import java.util.concurrent.Executors

class TryItemActivity : AppCompatActivity() {
    private val executor: Executor = Executors.newSingleThreadExecutor()
    private val REQUEST_CODE_PERMISSIONS = 1001
    private val REQUIRED_PERMISSIONS =
        arrayOf("android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE")

    var mPreviewView: PreviewView? = null
    var captureImage: ImageView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_try_item)
        mPreviewView = findViewById(R.id.previewView)
//        captureImage = findViewById(R.id.captureImg)
        if (allPermissionsGranted()) {
            startCamera() //start camera if permission has been granted by user
        } else {
            ActivityCompat.requestPermissions(this, REQUIRED_PERMISSIONS, REQUEST_CODE_PERMISSIONS)
        }
        settingUp()
    }

    private fun settingUp() {
        status.text = "Setting Up Camera..."
        val handler = Handler()
        handler.postDelayed({
            status.text = "Analysing..."
            pb.visibility = View.GONE
            tick.visibility = View.VISIBLE
            predictValues()
        }, 2000)
    }

    private fun predictValues() {
        val totalDelay: Long = 10000
        var currDelay: Long = 0
        val handler = Handler()
        handler.postDelayed(object : Runnable {
            @SuppressLint("SetTextI18n")
            override fun run() {
                Log.d("MyActivity", "Ding Ding")
                district.text = "${FunctionUtils().getRandomNumber(9, 15).toString()} cm"
                district2.text = "${FunctionUtils().getRandomNumber(30, 40).toString()} cm"
                district3.text = "${FunctionUtils().getRandomNumber(35, 42).toString()} cm"
                district4.text = "${FunctionUtils().getRandomNumber(60, 70).toString()} cm"
                district5.text = "${FunctionUtils().getRandomNumber(22, 28).toString()} cm"
                if (totalDelay >= currDelay) {
                    handler.postDelayed(this, 500) //added this line
                    currDelay += 500
                } else {
                    pb.visibility = View.VISIBLE
                    tick.visibility = View.GONE
                    status.text = "Finalizing Size..."
                    val handler2 = Handler()
                    handler.postDelayed({
                        DataProcessor.setStr(
                            this@TryItemActivity,
                            "sizeDetails",
                            Constants.sizes[FunctionUtils().getRandomNumber(0, 6)]
                        )
                        finish()
                    }, 1000)
                }
            }
        }, 7000)
    }

    private fun startCamera() {
        val cameraProviderFuture = ProcessCameraProvider.getInstance(this)
        cameraProviderFuture.addListener({
            try {
                val cameraProvider = cameraProviderFuture.get()
                bindPreview(cameraProvider)
            } catch (e: ExecutionException) {
                // No errors need to be handled for this Future.
                // This should never be reached.
            } catch (e: InterruptedException) {
            }
        }, ContextCompat.getMainExecutor(this))
    }

    fun bindPreview(cameraProvider: ProcessCameraProvider) {
        val preview = Preview.Builder()
            .build()
        val cameraSelector = CameraSelector.Builder()
            .requireLensFacing(CameraSelector.LENS_FACING_FRONT)
            .build()
        val imageAnalysis = ImageAnalysis.Builder()
            .build()
        val builder = ImageCapture.Builder()

        //Vendor-Extensions (The CameraX extensions dependency in build.gradle)
        val hdrImageCaptureExtender = HdrImageCaptureExtender.create(builder)

        // Query if extension is available (optional).
        if (hdrImageCaptureExtender.isExtensionAvailable(cameraSelector)) {
            // Enable the extension if available.
            hdrImageCaptureExtender.enableExtension(cameraSelector)
        }
        val imageCapture = builder
            .setTargetRotation(this.windowManager.defaultDisplay.rotation)
            .build()
        preview.setSurfaceProvider(mPreviewView?.createSurfaceProvider())
        val camera = cameraProvider.bindToLifecycle(
            (this as LifecycleOwner),
            cameraSelector,
            preview,
            imageAnalysis,
            imageCapture
        )
//        captureImage!!.setOnClickListener { v: View? ->
//            val mDateFormat =
//                SimpleDateFormat("yyyyMMddHHmmss", Locale.US)
//            val file =
//                File(getBatchDirectoryName(), mDateFormat.format(Date()) + ".jpg")
//            val outputFileOptions =
//                ImageCapture.OutputFileOptions.Builder(file).build()
//            imageCapture.takePicture(
//                outputFileOptions,
//                executor,
//                object : ImageCapture.OnImageSavedCallback {
//                    override fun onImageSaved(outputFileResults: ImageCapture.OutputFileResults) {
//                        Handler(Looper.getMainLooper()).post {
//                            Toast.makeText(
//                                this@TryItemActivity,
//                                "Image Saved successfully",
//                                Toast.LENGTH_SHORT
//                            ).show()
//                        }
//                    }
//
//                    override fun onError(error: ImageCaptureException) {
//                        error.printStackTrace()
//                    }
//                })
//        }
    }

    fun getBatchDirectoryName(): String? {
        var app_folder_path = ""
        app_folder_path = Environment.getExternalStorageDirectory().toString() + "/images"
        val dir = File(app_folder_path)
        if (!dir.exists() && !dir.mkdirs()) {
        }
        return app_folder_path
    }

    private fun allPermissionsGranted(): Boolean {
        for (permission in REQUIRED_PERMISSIONS) {
            if (ContextCompat.checkSelfPermission(
                    this,
                    permission
                ) != PackageManager.PERMISSION_GRANTED
            ) {
                return false
            }
        }
        return true
    }

    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<String?>,
        grantResults: IntArray
    ) {
        if (requestCode == REQUEST_CODE_PERMISSIONS) {
            if (allPermissionsGranted()) {
                startCamera()
            } else {
                Toast.makeText(this, "Permissions not granted by the user.", Toast.LENGTH_SHORT)
                    .show()
                finish()
            }
        }
    }

}