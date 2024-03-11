package com.example.helloignas

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var showButton = findViewById<Button>(R.id.displayButton)
        var textView = findViewById<TextView>(R.id.textView)

        showButton.setOnClickListener {
            textView.text = "Hello from Ignas Budreika"
        }

        var colorChangeButton = findViewById<Button>(R.id.textColorChangeButton)

        colorChangeButton.setOnClickListener {
            textView.setTextColor(Color.RED)
        }
    }
}