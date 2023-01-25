package com.example.myfirstapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast

class MainActivity26 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main26)

        val rgrp = findViewById<RadioGroup>(R.id.rgrp)
        val submit = findViewById<Button>(R.id.btn)

        submit.setOnClickListener {
            var option = rgrp.checkedRadioButtonId
            if (option == -1)
            {
                Toast.makeText(this, "Please select any one option", Toast.LENGTH_SHORT).show()
            }
            else
            {
                val rB = findViewById<RadioButton>(option)

                val output = rB.text.toString()
                val intent = Intent(this,MainActivity2::class.java)
                intent.putExtra("result",output)
                startActivity(intent)

            }
        }

    }
}