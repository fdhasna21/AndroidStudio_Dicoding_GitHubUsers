package com.fdhasna21.githubusers.resolver

import android.content.Context
import android.content.Intent
import android.net.Uri

class IntentData(val context: Context){
    fun openBrowser(url: String){
        val intent = Intent()
        intent.addCategory(Intent.CATEGORY_BROWSABLE)
        intent.action = Intent.ACTION_VIEW
        intent.data = Uri.parse(String.format(url))
        context.startActivity(intent)
    }

    fun openEmail(email:String){
        val intent = Intent()
        intent.action = Intent.ACTION_SENDTO
        intent.type = "text/plain"
        intent.data = Uri.parse("mailto:$email")
        context.startActivity(Intent.createChooser(intent, "Send email with"))
    }
}
