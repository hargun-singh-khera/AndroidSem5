package com.example.myfirstapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.Toast

class MainActivity15 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main15)

        val btn_ts = findViewById<Button>(R.id.toast1)
        btn_ts.setOnClickListener {
//            Toast.makeText(this,"I am Toast",Toast.LENGTH_LONG).show()
//            Toast.makeText(this,"Hello it is Toast",Toast.LENGTH_SHORT).show()
            val ts2 =Toast.makeText(this,"Toast with Gravity",Toast.LENGTH_SHORT)
            ts2.setGravity(Gravity.TOP,0,0)
            ts2.show()
        }
    }
}