package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class Onboarding_screen2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding_screen2)

        var deliverynextbtn = findViewById<ImageView>(R.id.deliverynext)
        deliverynextbtn.setOnClickListener{
            val intent5 = Intent(this, Onboarding_screen3::class.java)
            startActivity(intent5)
        }
    }
}