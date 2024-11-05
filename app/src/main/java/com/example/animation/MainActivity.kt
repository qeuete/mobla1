package com.example.animation

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val frameAnimButton = findViewById<Button>(R.id.frameAnimButton)
        val tweenAnimButton = findViewById<Button>(R.id.tweenAnimButton)

        // Load animations
        val fadeIn = AnimationUtils.loadAnimation(this, R.anim.main_activity_fade_in)
        val scaleIn = AnimationUtils.loadAnimation(this, R.anim.main_activity_scale_in)

        // Apply animations to buttons
        frameAnimButton.startAnimation(fadeIn)
        tweenAnimButton.startAnimation(scaleIn)

        frameAnimButton.setOnClickListener { v: View? ->
            val intent = Intent(this@MainActivity, FrameAnimationActivity::class.java)
            startActivity(intent)
        }

        tweenAnimButton.setOnClickListener { v: View? ->
            val intent = Intent(this@MainActivity, TweenAnimationActivity::class.java)
            startActivity(intent)
        }
    }
}
