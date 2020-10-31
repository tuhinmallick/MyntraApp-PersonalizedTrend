package com.myntra.android.myntratrendonsearch.ui

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import com.google.gson.Gson
import com.myntra.android.myntratrendonsearch.R

class ItemDetailsActivity : AppCompatActivity() {
    private var mSectionsPagerAdapter: SectionsPagerAdapter? = null
    private var mViewPager: ViewPager? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_item_details)
        val gson = Gson()
        val item = gson.fromJson<TrendingProduct>(intent.getStringExtra("item"), TrendingProduct::class.java)

        val toolbar: Toolbar = findViewById<View>(R.id.toolbar) as Toolbar
        toolbar.title = "Product Details"
        setSupportActionBar(toolbar)
        mSectionsPagerAdapter = SectionsPagerAdapter(supportFragmentManager, item, this)

        mViewPager = findViewById<View>(R.id.view_pager) as ViewPager
        mViewPager?.adapter = mSectionsPagerAdapter
        val tabLayout = findViewById<View>(R.id.tabs) as TabLayout
        tabLayout.setupWithViewPager(mViewPager)
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.M) {
            tabLayout.setTabTextColors(getColor(android.R.color.white), getColor(R.color.colorAccent))
        }
    }


    class SectionsPagerAdapter(fm: FragmentManager, private val item: TrendingProduct, private val context: Context) :
        FragmentPagerAdapter(fm) {
        override fun getItem(position: Int): Fragment {
            var fragment: Fragment =
                ItemInfoFragment(item)
            when (position) {
                0 -> fragment =
                    ItemInfoFragment(item)
                1 -> fragment =
                    TrendingFragment(item)
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