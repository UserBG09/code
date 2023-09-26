package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class language : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_language)

        val english = findViewById<Button>(R.id.englishbutton)
        english.setOnClickListener {
            val Intent = Intent(this, login::class.java)
            startActivity(Intent)


        }
    }

}