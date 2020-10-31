package com.myntra.android.myntratrendonsearch.ui

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.myntra.android.myntratrendonsearch.R

class CategoriesFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val v = inflater.inflate(R.layout.fragment_categories, container, false)
        v.findViewById<ImageView>(R.id.women).setOnClickListener {
            val i = Intent(context, ItemsListActivity::class.java)
            i.putExtra("category", "women")
            startActivity(i)
        }
        v.findViewById<ImageView>(R.id.men).setOnClickListener {
            val i = Intent(context, ItemsListActivity::class.java)
            i.putExtra("category", "men")
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