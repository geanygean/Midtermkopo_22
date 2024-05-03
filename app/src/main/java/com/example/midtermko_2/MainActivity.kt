package com.example.midtermko_2

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val WELCOMEButton = findViewById<Button>(R.id.buttonko)
        WELCOMEButton.setOnClickListener {
            // Create an Intent to start Main Activity
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
        val NextButton = findViewById<Button>(R.id.nbutton)
        NextButton.setOnClickListener {
            // Create an Intent to start Main Activity2
            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)
        }
        val ReturnButton = findViewById<Button>(R.id.button2)
        ReturnButton.setOnClickListener {
            // Create an Intent to start Main Activity3
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}