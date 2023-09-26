package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class details : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

    val detail = findViewById<Button>(R.id.getstartedbutton)
     detail.setOnClickListener{
         val Intent = Intent(this,content::class.java)
         startActivity(Intent)

     }



    }
}