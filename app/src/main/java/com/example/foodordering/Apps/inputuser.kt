package com.example.foodordering.Apps // Assuming this is the correct package name

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.widget.Toast
import com.example.foodordering.R
import com.example.foodordering.Database.user // Assuming user.kt is in the package "Database"
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class inputuser : AppCompatActivity() {

    private lateinit var inputButton: Button
    private lateinit var textPelayan: EditText
    private lateinit var textPelanggan: EditText
    private lateinit var nomorMeja: EditText
    private var nextId = 0
    private lateinit var ref: DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.inputuser)
        ref = FirebaseDatabase.getInstance().getReference("transaksi")
        inputButton = findViewById(R.id.inputButton)
        textPelayan = findViewById(R.id.TextPelayan)
        textPelanggan = findViewById(R.id.TextPelanggan)
        nomorMeja = findViewById(R.id.nomorMeja)

        inputButton.setOnClickListener {
            val intent = Intent(this, mainapps::class.java)

            // Check for empty fields individually
            if (textPelayan.text.isEmpty() || textPelanggan.text.isEmpty() || nomorMeja.text.isEmpty()) {
                Toast.makeText(this, "Semua field harus diisi!", Toast.LENGTH_SHORT).show()
            } else {

                // Handle potential NumberFormatException
                try {
                    val nomormeja = nomorMeja.text.toString().toInt()
                    val pelayan = textPelayan.text.toString()
                    val pelanggan = textPelanggan.text.toString()

                    // Increment nextId before generating ID
                    nextId++
                    val id = nextId.toString()
                    val user = user(nomormeja, pelayan, pelanggan)
                    ref.child(id).setValue(user).addOnSuccessListener {
                        Toast.makeText(this, "Data Berhasil Disimpan", Toast.LENGTH_SHORT).show()
                        startActivity(intent)
                    }
                } catch (e: NumberFormatException) {
                    Toast.makeText(this, "Please enter a valid number for table number", Toast.LENGTH_SHORT).show()
                }

            }
        }
    }
}
