package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class Onboarding_screen3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding_screen3)

        var getstartedbtn = findViewById<TextView>(R.id.getstarted)
        getstartedbtn.setOnClickListener{
            val intent6 = Intent(this, SignupPage::class.java)
            startActivity(intent6)
        }

    }
}