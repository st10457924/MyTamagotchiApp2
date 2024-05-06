package com.st10457924example.mytamagotchiapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val startButton = findViewById<Button>(R.id.startButton)
        startButton.setOnClickListener {
            //to move to the next page
            val intent = Intent( this, TamagotchiMainActivity2 ::class.java)
            startActivity(intent)
        }
    }
}







