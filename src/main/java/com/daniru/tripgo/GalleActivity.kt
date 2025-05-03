package com.daniru.tripgo

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.graphics.Insets
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class  GalleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_galle) // Make sure this XML file is named correctly

        // Handle edge-to-edge padding
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { view, insets ->
            val systemBars: Insets = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            view.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Home icon click
        val homeIcon = findViewById<ImageView>(R.id.homeIcon)
        homeIcon.setOnClickListener {
            Toast.makeText(this, "Returning Explore", Toast.LENGTH_SHORT).show()
            finish() // Optionally replace with navigation to HomeActivity
        }

        // Optional: Click feedback for categories or cards
        val locationTitle = findViewById<View>(R.id.locationTitle)
        locationTitle.setOnClickListener {
            Toast.makeText(this, "Welcome to Galle!", Toast.LENGTH_SHORT).show()
        }

        // TODO: Load dynamic data into cards and categories if needed
    }
}
