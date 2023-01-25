package com.example.myfirstapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        var num1 = findViewById<EditText>(R.id.et1)
        var num2 = findViewById<EditText>(R.id.et2)
        var tvres = findViewById<TextView>(R.id.tvres)

        var btnadd = findViewById<Button>(R.id.btnadd)
        var btnsub = findViewById<Button>(R.id.btnsub)
        var btnrem = findViewById<Button>(R.id.btnrem)
        var btnmul = findViewById<Button>(R.id.btnmul)
        var btndiv = findViewById<Button>(R.id.btndiv)
        var btnpow = findViewById<Button>(R.id.btnpow)

        btnadd.setOnClickListener {
            if (num1.text.toString().isEmpty() || num2.text.toString().isEmpty())
                tvres.text = "Plz fill out all the field into the Text box"
            else
            {
                var x:Int = num1.text.toString().toInt()
                var y:Int = num2.text.toString().toInt()
                var c = x+y
                tvres.text = c.toString()
            }
        }

    }
}