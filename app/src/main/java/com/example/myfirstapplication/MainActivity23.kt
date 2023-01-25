package com.example.myfirstapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.PopupMenu
import android.widget.Toast

class MainActivity23 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main23)

        val btn: Button = findViewById(R.id.popupmenubtn)
        btn.setOnClickListener {
            val pmenu = PopupMenu(this, btn)
            pmenu.menuInflater.inflate(R.menu.popupmenu, pmenu.menu)
            pmenu.setOnMenuItemClickListener {
                Toast.makeText(this, "You have selected option: " + it.title, Toast.LENGTH_SHORT).show()
                true
            }
            pmenu.show()
        }
    }
}