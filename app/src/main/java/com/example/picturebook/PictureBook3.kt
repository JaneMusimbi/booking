package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PictureBook3 : AppCompatActivity() {
    lateinit var btnButtonMe:Button
    lateinit var btnButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_picture_book3)
        btnButtonMe=findViewById(R.id.btnButtonMe)
        btnButtonMe.setOnClickListener {
            val intent=Intent(this,PictureBook5::class.java)
            startActivity(intent)
        }
         btnButton=findViewById(R.id.btnButton)
        btnButton.setOnClickListener {
           val intent=Intent(this,PictureBook2::class.java)
          startActivity(intent)}


    }
}
