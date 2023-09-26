package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class email : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_email)

    val logindetails = findViewById<Button>(R.id.nextbutton)
    logindetails.setOnClickListener {
        val Intent = Intent(this,details::class.java)
        startActivity(Intent)


    }


    }
}