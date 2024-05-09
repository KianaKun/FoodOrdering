package com.example.foodordering

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent

class inputuser : AppCompatActivity() {
    private lateinit var inputButton: Button
    private lateinit var textPelayan: EditText
    private lateinit var textPelanggan: EditText
    private lateinit var copyright: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.inputuser)

        inputButton = findViewById(R.id.inputButton)
        textPelayan = findViewById(R.id.TextPelayan)
        textPelanggan = findViewById(R.id.TextPelanggan)

        inputButton.setOnClickListener {
            val intent = Intent(this, mainapps::class.java)
            startActivity(intent);
        }
    }
}