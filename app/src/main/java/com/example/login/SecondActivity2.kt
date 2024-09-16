package com.example.login

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.login.databinding.ActivitySecond2Binding

class SecondActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivitySecond2Binding
    private var registeredEmail: String? = null
    private var registeredPassword: String? = null
    private var username: String? = null
    private var phone: String? = null
    private var gender: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecond2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        // Menyimpan semua data yang diterima dari MainActivity
        registeredEmail = intent.getStringExtra("email")
        registeredPassword = intent.getStringExtra("password")
        username = intent.getStringExtra("username")
        phone = intent.getStringExtra("phone")
        gender = intent.getStringExtra("gender")

        // Tombol login
        binding.btnlogin.setOnClickListener {
            val loginEmail = binding.loginEmail.text.toString()
            val loginPassword = binding.loginPasword.text.toString()

            if (loginEmail == registeredEmail && loginPassword == registeredPassword) {
                val profileIntent = Intent(this, ThirdActivity3::class.java).apply {
                    putExtra("email", registeredEmail)
                    putExtra("password", registeredPassword)
                    putExtra("username", username)
                    putExtra("phone", phone)
                    putExtra("gender", gender)
                }
                startActivity(profileIntent)
            } else {
                Toast.makeText(this, "Email atau password salah", Toast.LENGTH_SHORT).show()
            }
        }
    }
}