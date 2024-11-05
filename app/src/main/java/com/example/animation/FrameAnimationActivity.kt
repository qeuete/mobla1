package com.example.animation

import android.graphics.drawable.AnimationDrawable
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class FrameAnimationActivity : AppCompatActivity() {
    private lateinit var anim: ImageView
    private lateinit var startBtn: Button
    private lateinit var pauseBtn: Button
    private var frameAnimation: AnimationDrawable? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_frame_animation)

        anim = findViewById(R.id.anim)
        startBtn = findViewById(R.id.startBtn)
        pauseBtn = findViewById(R.id.pauseBtn)

        // Load frame animation
        frameAnimation = (anim.drawable as? AnimationDrawable)

        // Apply fade-in animation to ImageView
        val fadeIn = AnimationUtils.loadAnimation(this, R.anim.frame_animation_fade_in)
        anim.startAnimation(fadeIn)

        // Apply slide-in animation to buttons
        val slideIn = AnimationUtils.loadAnimation(this, R.anim.frame_animation_slide_in)
        startBtn.startAnimation(slideIn)
        pauseBtn.startAnimation(slideIn)

        startBtn.setOnClickListener {
            frameAnimation?.let { animation ->
                if (!animation.isRunning) {
                    animation.start()
                }
            }
        }

        pauseBtn.setOnClickListener {
            frameAnimation?.let { animation ->
                if (animation.isRunning) {
                    animation.stop()
                }
            }
        }
    }
}
