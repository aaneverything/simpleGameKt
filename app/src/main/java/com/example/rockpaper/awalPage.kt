package com.example.rockpaper

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class awalPage : AppCompatActivity() {
    lateinit var enterButton: Button

    private fun initComponents() {
        enterButton = findViewById(R.id.enterButton)
    }

    private fun ganti() {
        enterButton.setOnClickListener {
            val intent = Intent(this, GameActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_awal_page)

        initComponents()
        ganti()
    }
}