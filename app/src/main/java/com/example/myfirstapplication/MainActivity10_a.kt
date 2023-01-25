package com.example.myfirstapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity10_a : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main10_a)

        val name = findViewById<EditText>(R.id.txtname)
        val btn = findViewById<Button>(R.id.btnSubmit)

        btn.setOnClickListener {
            val t1 = name.text.toString()
            val intent = Intent(this,MainActivity10_c::class.java)
            intent.putExtra("t1",t1)

        }

    }
}