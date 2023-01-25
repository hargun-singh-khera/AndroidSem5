package com.example.myfirstapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity16 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main16)

        val btnlog = findViewById<Button>(R.id.btnlog)
        btnlog.setOnClickListener {
            Log.i("info1","This is my button 1 information")
        }

    }
}