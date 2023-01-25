package com.example.myfirstapplication

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.CallLog
import android.provider.ContactsContract
import android.provider.MediaStore
import android.widget.Button
import android.widget.EditText

class MainActivity13 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main13)

        val etUrl = findViewById<EditText>(R.id.urlText)
        val share = findViewById<Button>(R.id.share)
        val dialer = findViewById<Button>(R.id.dialer)
        val camera = findViewById<Button>(R.id.camera)
        val call = findViewById<Button>(R.id.calllogs)
        val contacts = findViewById<Button>(R.id.contacts)
        val gallery = findViewById<Button>(R.id.gallery)

        share.setOnClickListener {
            val url: String = etUrl.text.toString()
//            val url_int = Intent(Intent.ACTION_VIEW, Uri.parse(url))
//            var url_int = Intent(Intent.ACTION_SEND)
//            url_int.setType(url)
//            startActivity(url_int)

            val url_int = Intent(Intent.ACTION_VIEW, Uri.parse("https://$url"))
            startActivity(url_int)
        }

        dialer.setOnClickListener {
            val dial_int = Intent(Intent.ACTION_DIAL)
            dial_int.setData(Uri.parse("tel: +918787253841"))
            startActivity(dial_int)
        }

        camera.setOnClickListener {
            val cam_int = Intent(Intent.ACTION_VIEW)
            cam_int.setType(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(cam_int)
        }

        call.setOnClickListener {
            val call_int = Intent(Intent.ACTION_VIEW)
            call_int.setType(CallLog.Calls.CONTENT_TYPE)
            startActivity(call_int)
        }

        contacts.setOnClickListener {
            val cont_int = Intent(Intent.ACTION_PICK,ContactsContract.Contacts.CONTENT_URI)
            startActivity(cont_int)
        }

        gallery.setOnClickListener {
            val gly_int = Intent()
            gly_int.action = Intent.ACTION_VIEW
            gly_int.type = "image/*"
            startActivity(gly_int)
        }
    }
}