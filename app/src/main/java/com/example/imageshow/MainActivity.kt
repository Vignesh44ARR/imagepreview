package com.example.imageshow

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val imgs=findViewById<ImageView>(R.id.imageView)
        imgs.setOnClickListener {
            val ss=findViewById<ImageView>(R.id.mainimg)
            //ss.setImageResource(R.drawable.img1)
            showimage.imageshow(this)
        }
    }
}