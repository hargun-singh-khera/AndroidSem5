package com.example.myfirstapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity27 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main27)

        val et = findViewById<EditText>(R.id.et)
        val rgrp = findViewById<RadioGroup>(R.id.rgrp)
        val convert = findViewById<Button>(R.id.btn)
        val res = findViewById<TextView>(R.id.res)
        val rb1 = findViewById<RadioButton>(R.id.rb1)

        convert.setOnClickListener {
            val option = rgrp.checkedRadioButtonId
            if (option == -1)
            {
                res.text = "Plz select any one"
            }
            if (rb1.isChecked)
            {
                val c = ((et.text.toString().toDouble() -32)*5)/9
                res.text = "${c} Farenheit to Celcius"
            }
            else
            {
                val f = ((et.text.toString().toDouble() * 9)/5) + 32
                res.text = "${f} Celcius to Farenheit"
            }
        }

    }
}