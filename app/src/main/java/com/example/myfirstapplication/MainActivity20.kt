package com.example.myfirstapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import android.widget.Toast
import androidx.activity.result.ActivityResult
import androidx.activity.result.contract.ActivityResultContracts

class MainActivity20 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main20)

        val btncm = findViewById<Button>(R.id.btnCamera)
        val btngallery = findViewById<Button>(R.id.btnGallery)
        val requestCam = registerForActivityResult(ActivityResultContracts.RequestPermission())
        {
            if (it)
            {
                Toast.makeText(this,"Permission Granted",Toast.LENGTH_LONG).show()
                val int_cmr = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
                startActivity(int_cmr)
                finish()
            }
            else
            {
                Toast.makeText(this,"Permission denied...!",Toast.LENGTH_LONG).show()
            }
        }

        btncm.setOnClickListener {
            requestCam.launch(android.Manifest.permission.CAMERA)
        }

//        val requestGallery = registerForActivityResult(ActivityResultContracts.RequestPermission())
//        {
//            if (it)
//            {
//                Toast.makeText(this, "Permission Granted", Toast.LENGTH_SHORT).show()
//                val int_gal = Intent(MediaStore.)
//                startActivity(int_gal)
//                finish()
//            }
//            else
//            {
//                Toast.makeText(this, "Permission denied...!", Toast.LENGTH_SHORT).show()
//            }
//        }
//
//        btngallery.setOnClickListener {
//            requestGallery.launch(android.Manifest.permission.READ_EXTERNAL_STORAGE)
//        }
    }
}