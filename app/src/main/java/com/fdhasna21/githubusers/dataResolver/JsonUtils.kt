package com.fdhasna21.githubusers.dataResolver

import android.content.Context
import com.fdhasna21.githubusers.R
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.io.IOException
import java.util.*

fun getUserData(context: Context): ArrayList<User> {
    val listUserType = object : TypeToken<ArrayList<User>>() {}.type
    return Gson().fromJson(
        try {
            context.resources.openRawResource(R.raw.githubuser).bufferedReader()
                .use { it.readText() }
        } catch (ioException: IOException) {
            ioException.printStackTrace()
            null
        }, listUserType)
}