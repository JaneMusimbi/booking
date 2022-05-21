package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PictureBook1 : AppCompatActivity() {
    lateinit var btnNext1:Button
    lateinit var btnThree:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_picture_book1)
        btnNext1=findViewById(R.id.btnNext1)
        btnNext1.setOnClickListener {
            var intent=Intent(this,PictureBook2::class.java)
            startActivity(intent)

        }
        btnThree=findViewById(R.id.btnThree)
        btnThree.setOnClickListener {
            var intent=Intent(this,PictureBook1::class.java)
            startActivity(intent)
        }
    }
}
