package com.myntra.android.myntratrendonsearch.util

import android.content.Context
import android.content.SharedPreferences

class DataProcessor {
    companion object {

        fun setBool(ctx: Context, key: String?, value: Boolean) {
            val prefs = ctx.getSharedPreferences(PREFS_NAME, 0)
            val editor = prefs.edit()
            editor.putBoolean(key, value)
            editor.apply()
        }

        fun getBool(ctx: Context, key: String?): Boolean {
            val prefs = ctx.getSharedPreferences(PREFS_NAME, 0)
            return prefs.getBoolean(key, false)

        }


        fun setStr(ctx: Context, key: String?, value: String?) {
            val prefs = ctx.getSharedPreferences(PREFS_NAME, 0)
            val editor = prefs.edit()
            editor.putString(key, value)
            editor.apply()
        }

        fun getStr(ctx: Context, key: String?): String? {
            val prefs: SharedPreferences = ctx.getSharedPreferences(PREFS_NAME, 0)
            return prefs.getString(key, "DNF")
        }

        fun sharedPreferenceExist(ctx: Context, key: String?): Boolean {
            val prefs = ctx.getSharedPreferences(PREFS_NAME, 0)
            return !prefs.contains(key)
        }

        fun setInt(ctx: Context, key: String?, value: Int) {
            val prefs = ctx.getSharedPreferences(PREFS_NAME, 0)
            val editor = prefs.edit()
            editor.putInt(key, value)
            editor.apply()
        }

        fun getInt(ctx: Context, key: String?): Int {
            val prefs = ctx.getSharedPreferences(PREFS_NAME, 0)
            return prefs.getInt(key, 0)
        }

        private const val PREFS_NAME = "MyntraRef"

    }
}