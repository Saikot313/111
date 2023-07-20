package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity3 : AppCompatActivity() {
    lateinit var btn5 : Button
    lateinit var btn6 : Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        btn5  = findViewById(R.id.button5)
        btn6 = findViewById(R.id.button6)

        btn5.setOnClickListener {
            val intent = Intent (this,MainActivity::class.java)
            startActivity(intent)
        }

        btn6.setOnClickListener {
            val intent = Intent (this,MainActivity2::class.java)
            startActivity(intent)
        }
    }
}