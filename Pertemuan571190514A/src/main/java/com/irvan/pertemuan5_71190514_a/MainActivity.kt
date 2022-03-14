package com.irvan.pertemuan5_71190514_a

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val username = intent.getStringExtra("user")
        val tvhello = findViewById<TextView>(R.id.tvhello)
        tvhello.text = "Welcome ${username}!"

        val btnlogout = findViewById<Button>(R.id.btnlogout)
        btnlogout.setOnClickListener {
            val i: Intent(this, LoginActivity::class.java)
            startActivity(i)
        }
    }
}