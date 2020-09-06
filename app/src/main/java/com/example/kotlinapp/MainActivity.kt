package com.example.kotlinapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.util.*


class MainActivity : AppCompatActivity() {
    lateinit var img: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.rollButton)
        rollButton.setOnClickListener {
            rollDice()
        }
        img = findViewById(R.id.dice_image)
    }
// TODO finding dice image and putting in ImageView
    private fun rollDice() {
        val randomInt = Random().nextInt(6) + 1
        val randomImage = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        img.setImageResource(randomImage)
    }
}