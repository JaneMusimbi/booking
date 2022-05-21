package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PictureBook2 : AppCompatActivity() {
    lateinit var btnTwo:Button
    lateinit var btnOne:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_picture_book2)
        btnTwo=findViewById(R.id.btnTwo)
        btnTwo.setOnClickListener {
            var intent=Intent(this,PictureBook3::class.java)
            startActivity(intent)
        }
        btnOne=findViewById(R.id.btnOne)
        btnOne.setOnClickListener {
            var intent=Intent(this,PictureBook1::class.java)
            startActivity(intent)
        }

    }
}
