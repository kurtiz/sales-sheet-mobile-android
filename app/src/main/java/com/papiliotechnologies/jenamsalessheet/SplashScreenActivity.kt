package com.papiliotechnologies.jenamsalessheet


import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.os.Handler

@SuppressLint("CustomSplashScreen")
class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        // setting splash screen to fullscreen mode and setting status bar color to green
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS)
        window.statusBarColor = this.resources.getColor(R.color.green)

        // setting a short delay for the splash screen before switching the activity
        val mainIntent = Intent(this@SplashScreenActivity, MainActivity::class.java)
        Handler().postDelayed({
            startActivity(mainIntent)
            finish()
        }, 3000)
    }
}