package com.example.newsapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       val sportsBtn = findViewById<Button>(R.id.sports)
        sportsBtn.setOnClickListener {
            val intent = Intent(applicationContext, SportActivity::class.java)
            startActivity(intent)
        }
        val techBtn = findViewById<Button>(R.id.tech)
        techBtn.setOnClickListener {
            val intent = Intent(applicationContext, TechActivity::class.java)
            startActivity(intent)
        }
        var bbcNews = findViewById<Button>(R.id.bbc)
        bbcNews.setOnClickListener {
            var bbcIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.bbc.com"))
            startActivity(bbcIntent)
        }

        var emergencyBtn = findViewById<Button>(R.id.emergency)
        emergencyBtn.setOnClickListener {
            var eventIntent = Intent(Intent.ACTION_DIAL, Uri.parse("tel: 0712345678"))
            startActivity(eventIntent)
        }
        var scanBtn = findViewById<Button>(R.id.scan)
        scanBtn.setOnClickListener{
            var scanIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(scanIntent)
}   }
}