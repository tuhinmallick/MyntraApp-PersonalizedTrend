package com.myntra.android.myntratrendonsearch.ui.trending

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import com.google.gson.Gson
import com.myntra.android.myntratrendonsearch.R
import com.myntra.android.myntratrendonsearch.ui.model.TrendingProduct

class ItemDetailsActivity : AppCompatActivity() {
    private var mSectionsPagerAdapter: SectionsPagerAdapter? = null
    private var mViewPager: ViewPager? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_item_details)
        //getting intent data
        val gson = Gson()
        val item = gson.fromJson<TrendingProduct>(
            intent.getStringExtra("details"),
            TrendingProduct::class.java
        )

        //actionbar code
        actionBar?.title = "Product Details"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        //tab layout adapter
        mSectionsPagerAdapter = SectionsPagerAdapter(
            supportFragmentManager,
            item,
            this,
            intent.extras?.get("catDetails")?.toString() ?: "mentop"
        )
        mViewPager = findViewById<View>(R.id.view_pager) as ViewPager
        mViewPager?.adapter = mSectionsPagerAdapter
        val tabLayout = findViewById<View>(R.id.tabs) as TabLayout
        tabLayout.setupWithViewPager(mViewPager)
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.M) {
            tabLayout.setTabTextColors(
                getColor(android.R.color.white),
                getColor(R.color.colorAccent)
            )
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.nav_try -> {
                startActivity(Intent(this, TryItemActivity::class.java))
                return true
            }
            R.id.nav_wishlist -> {
                return true
            }
            R.id.nav_cart -> {
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.product_page_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    class SectionsPagerAdapter(
        fm: FragmentManager,
        private val item: TrendingProduct,
        private val context: Context,
        private val type: String
    ) :
        FragmentPagerAdapter(fm) {
        override fun getItem(position: Int): Fragment {
            var fragment: Fragment =
                ItemInfoFragment(item)
            when (position) {
                0 -> fragment =
                    ItemInfoFragment(item)
                1 -> fragment =
                    TrendingFragment(item, type)
            }
            return fragment
        }

        override fun getCount(): Int {
            // Show 2 total pages.
            return 2
        }

        override fun getPageTitle(position: Int): CharSequence? {
            when (position) {
                0 -> return "Product"
                1 -> return "Trending"
            }
            return null
        }
    }
}