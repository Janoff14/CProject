package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var b = findViewById<Button>(R.id.button)

        b.setOnClickListener {
            Toast.makeText(this,"yay!", Toast.LENGTH_SHORT).show()
        }

    }
}