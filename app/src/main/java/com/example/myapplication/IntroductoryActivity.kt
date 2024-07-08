package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.airbnb.lottie.LottieAnimationView

class IntroductoryActivity : AppCompatActivity() {
    private lateinit var logo: ImageView
    private lateinit var splashImg: ImageView
    private lateinit var lottieAnimationView: LottieAnimationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_introductory)

        logo = findViewById(R.id.logo)
        splashImg = findViewById(R.id.img)
        lottieAnimationView = findViewById(R.id.lottie)

        splashImg.animate().translationY(-1600f).setDuration(2200).setStartDelay(4000)
        logo.animate().translationY(1400f).setDuration(1000).setStartDelay(4000)
        lottieAnimationView.animate().translationY(1400f).setDuration(1000).setStartDelay(4000)

// Delay for the total duration of the animations before transitioning to the next activity
        val totalAnimationDuration = 7200 // 2200 + 1000 + 1000 + 4000
        android.os.Handler().postDelayed(
            {
                val intent3 = Intent(this@IntroductoryActivity, Onboarding_screen::class.java)
                startActivity(intent3)
                finish() // Optional: Finish the current activity to prevent going back to it
            },
            totalAnimationDuration.toLong()
        )
    }
}