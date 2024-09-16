package com.example.login

import android.content.Intent
import android.os.Bundle
import android.util.Log


import androidx.appcompat.app.AppCompatActivity
import com.example.login.databinding.ActivityMainBinding
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Tombol register
        binding.btnSignUp.setOnClickListener {
            val email = binding.etEmail.text.toString()
            val password = binding.etPasword.text.toString()
            val username = binding.etUsername.text.toString()
            val phone = binding.etNoHp.text.toString()
            val gender = binding.etJenisKelamin.text.toString()
            Log.d("MainActivity", "Username: $username, Phone: $phone, Gender: $gender")

            // Kirim data ke SecondActivity (Login)
            val loginIntent = Intent(this, SecondActivity2::class.java).apply {
                putExtra("email", email)
                putExtra("password", password)
                putExtra("username", username)
                putExtra("phone", phone)
                putExtra("gender", gender)
            }
            startActivity(loginIntent)
        }
    }
}