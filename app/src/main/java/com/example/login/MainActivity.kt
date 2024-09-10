package com.example.login

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {


    private lateinit var etEmail: EditText
    private lateinit var etFullname: EditText
    private lateinit var etUsername: EditText
    private lateinit var etPassword: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        etEmail = findViewById(R.id.etEmail)
        etFullname = findViewById(R.id.etFullname)
        etUsername = findViewById(R.id.etUsername)
        etPassword = findViewById(R.id.etPassword)


        val btnSignUp = findViewById<Button>(R.id.btnSignUp)


        btnSignUp.setOnClickListener {
            showTermsOfService()
        }
    }


    private fun showTermsOfService() {
        AlertDialog.Builder(this)
            .setTitle("Pemberitahunan")
            .setMessage("Hallo ganteng, apakah kamu menyetujui untuk membuat account.")
            .setPositiveButton("Accept") { _, _ ->

                val email = etEmail.text.toString()
                val fullname = etFullname.text.toString()
                val username = etUsername.text.toString()
                val password = etPassword.text.toString()


                val message = """
                    Sign Up Successful!
                    Email: $email
                    Full Name: $fullname
                    Username: $username
                    Password: $password
                """.trimIndent()
                Toast.makeText(this, message, Toast.LENGTH_LONG).show()
            }
            .setNegativeButton("Decline") { dialog, _ ->
                dialog.dismiss()
            }
            .show()
    }
}
