package com.example.movies_app

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity()  {
    lateinit var signInButton : Button
    lateinit var usernameEditText :TextView
    lateinit var passwordEditText : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
         usernameEditText = findViewById(R.id.username_input)
         passwordEditText = findViewById(R.id.password)
         signInButton = findViewById(R.id.sign_btn)

        signInButton.setOnClickListener {
            val username = usernameEditText.text.toString().trim()
            val password = passwordEditText.text.toString()


            if (username.isEmpty()) {
                Toast.makeText(this, "Username cannot be empty", Toast.LENGTH_SHORT).show()
            } else if (password.isEmpty()) {
                Toast.makeText(this, "Password cannot be empty", Toast.LENGTH_SHORT).show()
            } else if (password.length < 8) {
                Toast.makeText(this, "Password must be at least 8 characters long", Toast.LENGTH_SHORT).show()
            } else if (!password.any { it.isDigit() } || !password.any { it.isLetter() }) {
                Toast.makeText(this, "Password must contain at least one letter and one number", Toast.LENGTH_SHORT).show()
            } else {
                signInButton.setOnClickListener {
                    val intent = Intent(this, MainActivity2::class.java)
                    //intent.putExtra("USERNAME_KEY", username)
                    startActivity(intent)
                }
            }
            }

    }
    }
