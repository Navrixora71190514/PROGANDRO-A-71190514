package com.irvan.pertemuan5_71190514_a

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val eusername: EditText = findViewById(R.id.eusername)
        val esandi = findViewById<EditText>(R.id.esandi)
        val btnlogin = findViewById<Button>(R.id.btnlogin)
        btnlogin.setOnClickListener {
            login(eusername.text.toString(),esandi.text.toString())
        }
    }

    fun login(username: String, password: String){
        if(password.equals("1234")){
            val i: Intent = Intent(this, MainActivity::class.java)
            i.putExtra("user", username)
            startActivity(i)
        }else{
            showMessage("Katasandi Salah")
        }
    }

    fun showMessage(message: String){
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
    }
}