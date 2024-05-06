package com.st10457924example.mytamagotchiapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView


class TamagotchiMainActivity2 : AppCompatActivity() { @SuppressLint("MissingInflatedId")
override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_tamagotchi_main2)

    val petImageView = findViewById<ImageView>(R.id.petImageView)

    val feedButton = findViewById<Button>(R.id.feedButton)

    val cleanButton = findViewById<Button>(R.id.cleanButton)

    val playButton = findViewById<Button>(R.id.playButton)

    val petplayTextView = findViewById<TextView>(R.id.petplayTextView)

    feedButton.setOnClickListener {
        petImageView.setImageResource(R.drawable.dogeating)

        petplayTextView.text = "I appreciate you for feeding me"
    }
    cleanButton.setOnClickListener {
        petImageView.setImageResource(R.drawable.dogwash)

        petplayTextView.text = "Thank you for making me clean"
    }
    playButton.setOnClickListener {
        petImageView.setImageResource(R.drawable.dogplaying)

        petplayTextView.text = "Thank you, I had a great time playing with you"

    }
}
}


