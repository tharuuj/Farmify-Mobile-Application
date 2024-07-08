package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class SignupPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup_page)

        var button3 = findViewById<Button>(R.id.button3)
        button3.setOnClickListener{
            val intent8 = Intent(this, Loginpage::class.java)
            startActivity(intent8)
        }
        var button2 = findViewById<Button>(R.id.button2)
        button2.setOnClickListener{
            val intent9 = Intent(this, Testpage::class.java)
            startActivity(intent9)
        }
    }
}