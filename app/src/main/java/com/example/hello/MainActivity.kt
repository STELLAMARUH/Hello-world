package com.example.hello

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnLogin.SetOnClickListener {
            var userName = etUsername.text.toString()
            var password = etPassword.text.toString()
            Toast.makeText(baseContext, userName, Toast.LENGTH_LONG).show()
        }
    }
    }

private fun Button.SetOnClickListener(function: () -> Unit) {
    TODO("Not yet implemented")
}


