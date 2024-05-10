package com.example.foodordering.Apps

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.foodordering.R
class transactions : AppCompatActivity() {
    private lateinit var submittransaction: Button
    private lateinit var canceltransaction: Button
    private lateinit var textViewOrder: TextView
    private var sopIgaQty = 0
    private var nasiUdukQty = 0
    private var mieGorengQty = 0
    private var nasiGorengQty = 0
    private var esTehQty = 0
    private var esJerukQty = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.transaction)

        submittransaction = findViewById(R.id.buttonSubmit)
        canceltransaction = findViewById(R.id.buttonCancel)
        textViewOrder = findViewById(R.id.textViewOrder)

        canceltransaction.setOnClickListener {
            val intent = Intent(this, mainapps::class.java)
            startActivity(intent)
        }

        submittransaction.setOnClickListener {
            val intent = Intent(this, inputuser::class.java)
            startActivity(intent)
        }

        // Get the Intent that started this activity
        val intent = intent

        // Check if the Intent contains the expected data
        if (intent.hasExtra("sopIga")) {
            sopIgaQty = intent.getIntExtra("sopIga", 0)
            nasiUdukQty = intent.getIntExtra("nasiUduk", 0)
            mieGorengQty = intent.getIntExtra("mieGoreng", 0)
            nasiGorengQty = intent.getIntExtra("nasiGoreng", 0)
            esTehQty = intent.getIntExtra("esTeh", 0)
            esJerukQty = intent.getIntExtra("esJeruk", 0)

            // Display the order details
            val orderDetails = "Order Details:\n" +
                    "Sop Iga: $sopIgaQty\n" +
                    "Nasi Uduk: $nasiUdukQty\n" +
                    "Mie Goreng: $mieGorengQty\n" +
                    "Nasi Goreng: $nasiGorengQty\n" +
                    "Es Teh: $esTehQty\n" +
                    "Es Jeruk: $esJerukQty"

            // You can use a TextView or other UI element to display the orderDetails
            textViewOrder.text = orderDetails
        } else {
            // Handle the case where the data is missing
            Toast.makeText(this, "Order data not received!", Toast.LENGTH_SHORT).show()
        }
    }
}
