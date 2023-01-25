package com.example.myfirstapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity17 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main17)

        val email = findViewById<EditText>(R.id.et1)
        val pwd = findViewById<EditText>(R.id.et2)
        val login = findViewById<Button>(R.id.login)
        login.setOnClickListener {
            if (email.text.toString().isEmpty() || pwd.text.toString().isEmpty())
            {
                Toast.makeText(this,"Provide login id and password",Toast.LENGTH_LONG).show()
                Log.i("email","Enter mail id")
                Log.w("pwd","Enter password")
            }
        }
    }
}