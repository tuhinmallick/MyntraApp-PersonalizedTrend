package com.myntra.android.myntratrendonsearch.ui.main

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.myntra.android.myntratrendonsearch.R
import com.myntra.android.myntratrendonsearch.ui.trending.ItemsListActivity
import kotlinx.android.synthetic.main.fragment_categories.view.*

class CategoriesFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val v = inflater.inflate(R.layout.fragment_categories, container, false)
        (activity as AppCompatActivity)?.supportActionBar?.title = "Explore Trend"
        v.findViewById<ImageView>(R.id.women).setOnClickListener {
            val i = Intent(context, ItemsListActivity::class.java)
            i.putExtra("category", "women")
            startActivity(i)
        }
        v.findViewById<ImageView>(R.id.men).setOnClickListener {
            if (v.clTop.visibility == View.GONE) {
                v.clTop.visibility = View.VISIBLE
                v.clBottom.visibility = View.VISIBLE
            } else {
                v.clTop.visibility = View.GONE
                v.clBottom.visibility = View.GONE
            }
        }
        v.clTop.setOnClickListener {
            val i = Intent(context, ItemsListActivity::class.java)
            i.putExtra("category", "mentop")
            startActivity(i)
        }

        v.clBottom.setOnClickListener {
            val i = Intent(context, ItemsListActivity::class.java)
            i.putExtra("category", "menbottom")
            startActivity(i)
        }

        v.findViewById<ImageView>(R.id.kids).setOnClickListener {
            val i = Intent(context, ItemsListActivity::class.java)
            i.putExtra("category", "kids")
            startActivity(i)
        }
        v.findViewById<ImageView>(R.id.allfestive).setOnClickListener {
            val i = Intent(context, ItemsListActivity::class.java)
            i.putExtra("category", "festive")
            startActivity(i)
        }
        v.findViewById<ImageView>(R.id.homeliving).setOnClickListener {
            val i = Intent(context, ItemsListActivity::class.java)
            i.putExtra("category", "home")
            startActivity(i)
        }
        v.findViewById<ImageView>(R.id.gadgets).setOnClickListener {
            val i = Intent(context, ItemsListActivity::class.java)
            i.putExtra("category", "gadgets")
            startActivity(i)
        }
        return v
    }


    private fun openFragment(frag: Fragment) {
        (activity as AppCompatActivity).supportFragmentManager.beginTransaction().hide(this)
            .add(
                R.id.fragment_container,
                frag,
                "ItemList"
            )
            .addToBackStack(null).commit()
    }

}