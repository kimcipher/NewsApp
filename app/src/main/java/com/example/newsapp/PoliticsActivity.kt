package com.example.newsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class PoliticsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_politics)

        val politics = findViewById<WebView>(R.id.webView)
        politics.loadUrl("file:///android_asset/politics.html")
    }
}