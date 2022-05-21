package com.example.picturebook

import android.content.Intent
import android.media.tv.TvContract
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Telephony
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnNext: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnNext = findViewById(R.id.btnNext)
        btnNext.setOnClickListener {
            var intent=Intent(this,PictureBook1::class.java)
            startActivity(intent)

        }



        }
    }


