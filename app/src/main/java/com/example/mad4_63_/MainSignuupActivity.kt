package com.example.mad4_63_

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainSignuupActivity : AppCompatActivity() {
    lateinit var loginbtn:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_signuup)
        loginbtn=findViewById(R.id.login_btn_e)
        loginbtn.setOnClickListener{
            val intent=Intent(this,MainLoginActivity::class.java)
            startActivity(intent)
        }
    }
}