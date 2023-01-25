package com.example.myfirstapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity24 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main24)

        val btn_alert = findViewById<Button>(R.id.btnalert)
        btn_alert.setOnClickListener {
            val builder = AlertDialog.Builder(this)
            builder.setTitle("My Alert Dialogue").setMessage("Do you want to close it?").setCancelable(true).setIcon(android.R.drawable.ic_dialog_alert)

            builder.setPositiveButton("Yes") {dialog, which ->
                Toast.makeText(this, "Yes Option clicked!", Toast.LENGTH_LONG).show()
                finish()
            }
            builder.setNegativeButton("No") {dialog, which ->
                Toast.makeText(this, "No Option clicked!", Toast.LENGTH_SHORT).show()
            }
            builder.setNeutralButton("Cancel") {dialog, which ->
                dialog.cancel()
                Toast.makeText(this, "Cancel Option clicked!", Toast.LENGTH_SHORT).show()
            }

            val ad:AlertDialog = builder.create()
            ad.show()
        }
    }
}