package com.example.foodordering

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.widget.Toast

class inputuser : AppCompatActivity() {
    private lateinit var inputButton: Button
    private lateinit var textPelayan: EditText
    private lateinit var textPelanggan: EditText
    private lateinit var nomorMeja: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.inputuser)

        inputButton = findViewById(R.id.inputButton)
        textPelayan = findViewById(R.id.TextPelayan)
        textPelanggan = findViewById(R.id.TextPelanggan)
        nomorMeja= findViewById(R.id.nomorMeja)

        inputButton.setOnClickListener {
            val intent = Intent(this, mainapps::class.java)
            if (textPelayan.text.isEmpty() and textPelanggan.text.isEmpty() and nomorMeja.text.isEmpty() ) {
                Toast.makeText(this, "Nama Pelayan atau Nama Pelanggan Kosong atau Meja Kosong", Toast.LENGTH_SHORT).show()
            } else {
                startActivity(intent)
            }
            
        }
    }
}