package com.example.foodordering.Apps // Assuming this is the correct package name

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.widget.Toast
import com.example.foodordering.R


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
        nomorMeja = findViewById(R.id.nomorMeja)

        inputButton.setOnClickListener {
            val nextScene = Intent(this, mainapps::class.java)
            // Check for empty fields individually
            if (textPelayan.text.isEmpty() || textPelanggan.text.isEmpty() || nomorMeja.text.isEmpty()) {
                Toast.makeText(this, "Semua field harus diisi!", Toast.LENGTH_SHORT).show()
            } else {
                try {

                    val userData = Bundle()
                    userData.putString("pelayan", textPelayan.text.toString())
                    userData.putString("pelanggan", textPelanggan.text.toString())
                    userData.putInt("nomorMeja", nomorMeja.text.toString().toInt())
                    nextScene.putExtras(userData)
                    finish()
                    startActivity(nextScene)
                } catch (e: NumberFormatException) {
                    Toast.makeText(this, "Masukan nomor meja!", Toast.LENGTH_SHORT).show()
                }

            }
        }
    }

        override fun onBackPressed() {
        super.onBackPressed()
            finishAffinity()
    }
}
