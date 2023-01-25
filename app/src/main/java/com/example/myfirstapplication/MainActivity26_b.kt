package com.example.myfirstapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity26_b : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main26_b)

        val res = findViewById<TextView>(R.id.res)
        val output = intent.getStringExtra("result")
        res.text = "${output} University is Opened from 9:00AM to 5:00 PM"

    }
}