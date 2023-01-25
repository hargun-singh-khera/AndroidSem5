package com.example.myfirstapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MainActivity22 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main22)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.optionalmenu,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val id = item.itemId
        when(id)
        {
            R.id.settings ->
            {
                Toast.makeText(this, "Settings clicked", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.payments ->
            {
                Toast.makeText(this, "Payments clicked", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.newgroup ->
            {
                Toast.makeText(this, "New group clicked", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.exit ->
            {
                Toast.makeText(this, "Exit clicked", Toast.LENGTH_SHORT).show()
                finish()
                true
            }
            else ->
            {
                Toast.makeText(this, "Nothing clicked", Toast.LENGTH_SHORT).show()
            }
        }
        return super.onOptionsItemSelected(item)
    }
}