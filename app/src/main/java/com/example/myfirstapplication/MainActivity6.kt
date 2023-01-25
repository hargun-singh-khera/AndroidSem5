package com.example.myfirstapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main6)

        val editName = findViewById<EditText>(R.id.editName)
        val editPass = findViewById<EditText>(R.id.editPass)
        val editEmail = findViewById<EditText>(R.id.editEmail)
        val editDate = findViewById<EditText>(R.id.editDate)
        val editPhone = findViewById<EditText>(R.id.editPhone)
        val btn = findViewById<Button>(R.id.submit)
        val reset = findViewById<Button>(R.id.reset)
        val res = findViewById<TextView>(R.id.res)
        var spinner = findViewById<Spinner>(R.id.dropdown)

        var course = arrayOf("B-Tech","B.C.A","B.Sc.","M.C.A","B.B.A")

        var option = ""

        if (spinner != null) {
            val adapter = ArrayAdapter(
                this,
                android.R.layout.simple_spinner_item,course
            )
            spinner.adapter = adapter

            spinner.onItemSelectedListener = object :
                AdapterView.OnItemSelectedListener {
                override fun onItemSelected(parent: AdapterView<*>?, view: View, position: Int, id: Long) {
                    option = course[position]
                }

                override fun onNothingSelected(p0: AdapterView<*>?) {
                }
            }
        }


        btn.setOnClickListener() {
            val t1 = editName.text.toString()
            val t2 = editPass.text.toString()
            val t3 = editEmail.text.toString()
            val t4 = editDate.text.toString()
            val t5 = editPhone.text.toString()

            if (t1.isEmpty() || t2.isEmpty() || t3.isEmpty() || t4.isEmpty() || t5.isEmpty())
            {
                res.text = "Enter all the values"
            }
            else
            {
                res.text = "Name: ${t1} \n" +
                        "Password: ${t2} \n" +
                        "Email: ${t3} \n" +
                        "Date: ${t4} \n" +
                        "Phone Number: ${t5}"
            }
        }

        reset.setOnClickListener {
            editName.text.clear()
            editPass.text.clear()
            editEmail.text.clear()
            editDate.text.clear()
            editPhone.text.clear()
            res.text = ""
        }

    }
}