package com.example.myfirstapplication

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar

class MainActivity19 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main19)

        val layout = findViewById<LinearLayout>(R.id.layout)
        val et1 = findViewById<EditText>(R.id.url)
        var b: Button = findViewById(R.id.button1)
        var t = findViewById<TextView>(R.id.textView1)

        b.setOnClickListener {
            val name: String = et1.text.toString()
            t.text = "Hi $name, you are registered"
            val s:Snackbar = Snackbar.make(it,"Do you want to deregister yourself?",Snackbar.LENGTH_INDEFINITE)
            s.setAction("undo") {
                t.setText("$name successfully deregistered!")
                val s:Snackbar = Snackbar.make(layout,"Undo operation done successfully",Snackbar.LENGTH_INDEFINITE)
                s.show()
            }
            s.setTextColor(Color.WHITE)
            s.setBackgroundTint(Color.RED)
            s.show()
        }

    }
}