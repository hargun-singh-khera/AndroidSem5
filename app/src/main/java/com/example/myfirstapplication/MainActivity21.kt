package com.example.myfirstapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.MenuItem
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity21 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main21)

        val tv1 = findViewById<TextView>(R.id.textView1)
        registerForContextMenu(tv1)
    }

    override fun onCreateContextMenu(
        menu: ContextMenu?,
        v: View?,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) {
        super.onCreateContextMenu(menu, v, menuInfo)
        menu?.setHeaderTitle("Choose your option")
        menuInflater.inflate(R.menu.context,menu)
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        when(item.itemId)
        {
            R.id.option_1 ->
            {
                Toast.makeText(this, "Option 1 Selected", Toast.LENGTH_SHORT).show()
            }
            R.id.option_2 ->
            {
                Toast.makeText(this, "Option 2 Selected", Toast.LENGTH_SHORT).show()
            }
            R.id.option_3 ->
            {
                Toast.makeText(this, "Option 3 Selected", Toast.LENGTH_SHORT).show()
            }
            R.id.option_4 ->
            {
                Toast.makeText(this, "Option 4 Selected", Toast.LENGTH_SHORT).show()
            }
            else ->
            {
                Toast.makeText(this, "You have not selected any option", Toast.LENGTH_SHORT).show()
            }
        }
        return super.onContextItemSelected(item)
    }

}