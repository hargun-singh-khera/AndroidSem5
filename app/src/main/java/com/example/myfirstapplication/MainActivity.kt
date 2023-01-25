package com.example.myfirstapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        var et1 = findViewById<EditText>(R.id.et_box)
        var et1 = findViewById<EditText>(R.id.et_num1)
        var et2 = findViewById<EditText>(R.id.et_num2)
//        var btn1 = findViewById<Button>(R.id.btnSubmit)
        var btnadd = findViewById<Button>(R.id.btnadd)
        var btnsub = findViewById<Button>(R.id.btnsub)
        var btnmul = findViewById<Button>(R.id.btnmul)
        var btndiv = findViewById<Button>(R.id.btndiv)
        var tv1 = findViewById<TextView>(R.id.tv1)

        btnadd.setOnClickListener {
            if (et1.text.toString().isEmpty() || et2.text.toString().isEmpty())
                tv1.text = "Plz fill out all the field into the Text box"
            else
            {
                var x:Int = et1.text.toString().toInt()
                var y:Int = et2.text.toString().toInt()
                var c = x+y
                tv1.text = c.toString()
            }
        }
        btnsub.setOnClickListener {
            if (et1.text.toString().isEmpty() || et2.text.toString().isEmpty())
                tv1.text = "Plz fill out all the field into the Text box"
            else
            {
                var x:Int = et1.text.toString().toInt()
                var y:Int = et2.text.toString().toInt()
                var c = x-y
                tv1.text = c.toString()
            }
        }
        btnmul.setOnClickListener {
            if (et1.text.toString().isEmpty() || et2.text.toString().isEmpty())
                tv1.text = "Plz fill out all the field into the Text box"
            else
            {
                var x:Int = et1.text.toString().toInt()
                var y:Int = et2.text.toString().toInt()
                var c = x*y
                tv1.text = c.toString()
            }
        }
        btndiv.setOnClickListener {
            if (et1.text.toString().isEmpty() || et2.text.toString().isEmpty())
                tv1.text = "Plz fill out all the field into the Text box"
            else
            {
                var x:Int = et1.text.toString().toInt()
                var y:Int = et2.text.toString().toInt()
                var c = x/y
                tv1.text = c.toString()
            }
        }


//        btn1.setOnClickListener {
//            if (et1.text.toString().isEmpty())
//                tv1.text = "Plz fill the text into Text box"
//            else
//                tv1.text = et1.text.toString()
//        }

    }
}