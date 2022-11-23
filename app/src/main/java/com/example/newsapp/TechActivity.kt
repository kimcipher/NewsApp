package com.example.newsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class TechActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tech)

        val tech= findViewById<WebView>(R.id.webView)
        tech.loadUrl("file:///android_asset/tech.html")
    }
}