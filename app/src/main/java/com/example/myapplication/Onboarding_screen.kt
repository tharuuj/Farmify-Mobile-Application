package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class Onboarding_screen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding_screen)

        var welcomenextbtn = findViewById<ImageView>(R.id.welcomenext)
        welcomenextbtn.setOnClickListener{
            val intent4 = Intent(this, Onboarding_screen2::class.java)
            startActivity(intent4)
        }
    }
}