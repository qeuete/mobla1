package com.example.animation

import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class TweenAnimationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tween_animation)

        val imageView = findViewById<ImageView>(R.id.imageView)

        // Load and apply the combined animation
        val combinedAnimation = AnimationUtils.loadAnimation(this, R.anim.tween_activity_combined)
        imageView.startAnimation(combinedAnimation)
    }
}
