package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Loginpage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loginpage)

        var button3 = findViewById<Button>(R.id.button3)
        button3.setOnClickListener{
            val intent10 = Intent(this, SignupPage::class.java)
            startActivity(intent10)
        }
        var button2 = findViewById<Button>(R.id.button2)
        button2.setOnClickListener{
            val intent10 = Intent(this, Testpage::class.java)
            startActivity(intent10)
        }
    }
}