package com.example.imadpracticum

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState
        enableEdgeToEdge()
        setContentView(R.layout.activity_splash_screen)

            val startButton: Button = findViewById(R.id.startButton)
        val exitButton: Button = findViewById(R.id.exitButton)

        startButton setOnClickListener{
            val intent = Intent (this, DetailedScreenActivity:: class.java)
            startActivty intent
                    finish()
        }
        exitButton setOnClickListener {
            finish()
        }
    }
}

