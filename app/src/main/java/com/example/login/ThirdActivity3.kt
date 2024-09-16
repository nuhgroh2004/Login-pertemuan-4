package com.example.login

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.login.databinding.ActivitySecond2Binding
import com.example.login.databinding.ActivityThird3Binding
class ThirdActivity3 : AppCompatActivity() {
    private lateinit var binding: ActivityThird3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityThird3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        // Menampilkan data yang diterima dengan pengecekan null
        binding.txtEmail.text = intent.getStringExtra("email") ?: "N/A"
        binding.txtPassword.text = intent.getStringExtra("password") ?: "N/A"
        binding.txtUsername.text = intent.getStringExtra("username") ?: "N/A"
        binding.txtNohp.text = intent.getStringExtra("phone") ?: "N/A"
        binding.txtJenisKelamin.text = intent.getStringExtra("gender") ?: "N/A"

        // Tombol Edit Profil
        binding.btnEdit.setOnClickListener {
            // Hapus data
            binding.txtEmail.text = ""
            binding.txtPassword.text = ""
            binding.txtUsername.text = ""
            binding.txtNohp.text = ""
            binding.txtJenisKelamin.text = ""

            // Kembali ke halaman register
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish() // Menutup aktivitas ini agar tidak bisa kembali dengan tombol back
        }
    }
}