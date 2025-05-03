package com.daniru.tripgo

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.core.graphics.Insets
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.Toast

class FamilyDayOutActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_family_day_out)

        // Handle edge-to-edge UI
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars: Insets = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Example click: Invite button
        findViewById<View>(R.id.buttonInvite).setOnClickListener {
            Toast.makeText(this, "Invite button clicked", Toast.LENGTH_SHORT).show()
        }


        // Example click: Home button
        findViewById<View>(R.id.buttonHome).setOnClickListener {
            Toast.makeText(this, "Returning Home", Toast.LENGTH_SHORT).show()
            finish() // Or navigate to HomeActivity if needed
        }
    }
}
