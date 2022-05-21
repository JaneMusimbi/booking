package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PictureBook5 : AppCompatActivity() {
    lateinit var btnButton5:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_picture_book5)
        btnButton5=findViewById(R.id.btnButton5)
        btnButton5.setOnClickListener {
            var intent=Intent(this,PictureBook3::class.java)
            startActivity(intent)
        }

    }
}
