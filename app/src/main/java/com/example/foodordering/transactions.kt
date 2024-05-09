package com.example.foodordering

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class transactions : AppCompatActivity() {
    private lateinit var submittransaction: Button
    private lateinit var canceltransaction: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.transaction)

        submittransaction = findViewById(R.id.buttonSubmit)
        canceltransaction = findViewById(R.id.buttonCancel)

        canceltransaction.setOnClickListener {
            val intent = Intent(this, mainapps::class.java)
            startActivity(intent)
        }

        submittransaction.setOnClickListener {
            val intent = Intent(this, mainapps::class.java)
            startActivity(intent)
        }
    }
}

