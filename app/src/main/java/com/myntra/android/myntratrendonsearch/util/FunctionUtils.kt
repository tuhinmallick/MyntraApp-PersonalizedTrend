package com.myntra.android.myntratrendonsearch.util

import android.annotation.SuppressLint
import android.app.Dialog
import android.content.ClipData
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.net.Uri
import android.view.Window
import android.widget.Toast
import java.text.DateFormat
import java.text.SimpleDateFormat
import java.util.*

class FunctionUtils {
   fun getRandomNumber(min: Int, max: Int): Int {
        return (Math.random() * (max - min) + min).toInt()
    }

    fun createDialogBox(
        context: Context,
        id: Int
    ): Dialog? {
        val dialog = Dialog(context)
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog.setCancelable(false)
        dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        dialog.setContentView(id)

        return dialog
    }


    fun isAppAvailable(context: Context, appName: String): Boolean {
        val pm = context.packageManager
        return try {
            pm.getPackageInfo(appName, PackageManager.GET_ACTIVITIES)!!
            true
        } catch (e: PackageManager.NameNotFoundException) {
            e.printStackTrace()
            false
        }
    }

    fun copyToClipboard(str: String, context: Context) {
        val clipboard =
            context.getSystemService(Context.CLIPBOARD_SERVICE) as android.content.ClipboardManager
        val clip = ClipData.newPlainText("Copied Text", str)
        clipboard.setPrimaryClip(clip)
        Toast.makeText(context, "Copied successfully", Toast.LENGTH_SHORT).show()
    }

    fun fromMillisToTimeString(millis: Long): String {
        val format = SimpleDateFormat("hh:mm a", Locale.getDefault())
        return format.format(millis)
    }

    fun onClickWhatsApp(referralCode: String, context: Context): Intent? {
        val pm: PackageManager = context.packageManager
        val waIntent = Intent(Intent.ACTION_SEND)
        try {

            waIntent.type = "text/plain"
            val text = "Use this code to install UMC app: $referralCode"
            val info = pm.getPackageInfo("com.whatsapp", PackageManager.GET_META_DATA)
            //Check if package exists or not. If not then code
            //in catch block will be called
            waIntent.setPackage("com.whatsapp")
            waIntent.putExtra(Intent.EXTRA_TEXT, text)
        } catch (e: PackageManager.NameNotFoundException) {
            Toast.makeText(context, "WhatsApp not Installed", Toast.LENGTH_SHORT)
                .show()
        }
        return Intent.createChooser(waIntent, "Share with")

    }

    fun newFacebookIntent(url: String, context: Context): Intent? {
        val pm: PackageManager = context.packageManager
        var uri: Uri = Uri.parse(url)
        try {
            val applicationInfo = pm.getApplicationInfo("com.facebook.katana", 0)
            if (applicationInfo.enabled) {
                uri = Uri.parse("fb://facewebmodal/f?href=$url")
            }
        } catch (ignored: PackageManager.NameNotFoundException) {
            Toast.makeText(context, "Facebook Not Installed", Toast.LENGTH_SHORT).show()
        }
        return Intent(Intent.ACTION_VIEW, uri)
    }


    fun printDifference(startDate: Date, endDate: Date): Long {
        //milliseconds
        var different = endDate.time - startDate.time

        val secondsInMilli: Long = 1000
        val minutesInMilli = secondsInMilli * 60
        val hoursInMilli = minutesInMilli * 60
        val daysInMilli = hoursInMilli * 24
        val elapsedSec = different / secondsInMilli
        return elapsedSec

    }

    @SuppressLint("SimpleDateFormat")
    fun getDate(ourDate: String): String? {

        val dateFormat: DateFormat = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssXX")
        val date: Date =
            dateFormat.parse(ourDate) //You will get date object relative to server/client timezone wherever it is parsed
        val formatter: DateFormat =
            SimpleDateFormat("yyyy-MM-dd HH:mm:ss") //If you need time just put specific format for time like 'HH:mm:ss'
        //f you need time just put specific format for time like 'HH:mm:ss'
        formatter.timeZone = TimeZone.getDefault()

        val dateStr = formatter.format(date)
        return dateStr
    }

}