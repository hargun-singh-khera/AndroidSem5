package com.example.myfirstapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity28 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main28)

        val name = findViewById<EditText>(R.id.name)
        val email = findViewById<EditText>(R.id.email)
        val pnum = findViewById<EditText>(R.id.num)
        val pass = findViewById<EditText>(R.id.pass)
        val submit = findViewById<Button>(R.id.submit)

        submit.setOnClickListener {
            val t1 = name.text.toString()
            val t2 = email.text.toString()
            val t3 = pnum.text.toString()
            val t4 = pass.text.toString()

            if (t1.isEmpty() || t2.isEmpty() || t3.isEmpty() || t3.isEmpty() || t4.isEmpty())
            {
                Toast.makeText(this, "Please fill all fields", Toast.LENGTH_SHORT).show()
            }
            else
            {
                var result = StringBuilder()
                result.append("Name: ${t1}")
                result.append("\nEmail: ${t2}")
                result.append("\nPhone Number: ${t3}")
                result.append("\nPassword: ${t4}")
                Toast.makeText(this, result.toString(), Toast.LENGTH_SHORT).show()
            }
        }

    }
}