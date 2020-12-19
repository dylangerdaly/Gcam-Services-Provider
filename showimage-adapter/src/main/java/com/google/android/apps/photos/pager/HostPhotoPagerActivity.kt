package com.google.android.apps.photos.pager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class HostPhotoPagerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.i("GPhotosFake", "GPhotosFake")
        intent
    }
}