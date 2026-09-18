package com.example.mindfuldigest

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnToggleDetox = findViewById<Button>(R.id.btnToggleDetox)
        btnToggleDetox?.setOnClickListener {
            Toast.makeText(this, "डिटॉक्स मोड सक्रिय आहे!", Toast.LENGTH_SHORT).show()
        }
    }
}
