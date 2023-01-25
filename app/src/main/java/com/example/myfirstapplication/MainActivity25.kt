package com.example.myfirstapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity25 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main25)

        val btnsimple = findViewById<Button>(R.id.btn1)
        val btnitem = findViewById<Button>(R.id.btn2)

        btnsimple.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            builder.setTitle("It is Simple Alert")
            builder.setMessage("It is simple alert message")
            builder.setCancelable(false)
            builder.setPositiveButton("Ok") {dialog, which ->
                Toast.makeText(this, "Ok clicked! ", Toast.LENGTH_SHORT).show()
            }
            builder.setNegativeButton("Not Ok") {dialog, which->
                Toast.makeText(this, "Not Ok clicked!", Toast.LENGTH_SHORT).show()
            }
            builder.show()
        }

        btnitem.setOnClickListener {
            val item = arrayOf("CSE","ECE","EEE","Civil","Other Engg")
            val builder = AlertDialog.Builder(this)
            builder.setTitle("List of items")
            builder.setItems(item) {dialog, which ->
                Toast.makeText(this, item[which]+" clicked", Toast.LENGTH_SHORT).show()
            }
            builder.setPositiveButton("Ok",null)
            builder.setNegativeButton("Cancel",null)
            builder.setNeutralButton("Nothing...",null)
            builder.create().show()
        }

    }
}