package com.example.foodordering.Apps

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.foodordering.Database.transaction
import com.example.foodordering.R
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class transactions : AppCompatActivity() {
    private lateinit var submittransaction: Button
    private lateinit var canceltransaction: Button
    private lateinit var textViewOrder: TextView
    private lateinit var textViewUser: TextView
    private lateinit var ref: DatabaseReference

    private var sopIgaQty = 0
    private var nasiUdukQty = 0
    private var mieGorengQty = 0
    private var nasiGorengQty = 0
    private var esTehQty = 0
    private var esJerukQty = 0
    private var pelayan=("")
    private var pelanggan=("")
    private var nomorMeja=0
    private var nextId = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.transaction)

        submittransaction = findViewById(R.id.buttonSubmit)
        canceltransaction = findViewById(R.id.buttonCancel)
        textViewOrder = findViewById(R.id.textViewOrder)
        textViewUser = findViewById(R.id.textViewUser)
        ref= FirebaseDatabase.getInstance().getReference("transaksi")
        val getOrder = intent

        if (intent.hasExtra("sopIga")) {
            pelayan = getOrder.getStringExtra("pelayan")!!
            pelanggan = getOrder.getStringExtra("pelanggan")!!
            nomorMeja = getOrder.getIntExtra("nomorMeja", 0)
            sopIgaQty = getOrder.getIntExtra("sopIga", 0)
            nasiUdukQty = getOrder.getIntExtra("nasiUduk", 0)
            mieGorengQty = getOrder.getIntExtra("mieGoreng", 0)
            nasiGorengQty = getOrder.getIntExtra("nasiGoreng", 0)
            esTehQty = getOrder.getIntExtra("esTeh", 0)
            esJerukQty = getOrder.getIntExtra("esJeruk", 0)

            // Display the order details
            val foodDetails = "Order Details:\n" +
                    "Sop Iga: $sopIgaQty\n" +
                    "Nasi Uduk: $nasiUdukQty\n" +
                    "Mie Goreng: $mieGorengQty\n" +
                    "Nasi Goreng: $nasiGorengQty\n" +
                    "Es Teh: $esTehQty\n" +
                    "Es Jeruk: $esJerukQty"

            val userDetails = "User Details:\n" +
                    "Pelayan: $pelayan\n" +
                    "Pelanggan: $pelanggan\n" +
                    "Nomor Meja: $nomorMeja"

            textViewUser.text = userDetails
            textViewOrder.text = foodDetails

        } else {
            // Handle the case where the data is missing
            Toast.makeText(this, "Order data not received!", Toast.LENGTH_SHORT).show()
        }

        canceltransaction.setOnClickListener {
            val intent =Intent(this, inputuser::class.java) // Start mainapps activity (optional)
            startActivity(intent)
            Toast.makeText(this, "Data tidak berhasil Disimpan, Silahkan Order Ulang!", Toast.LENGTH_SHORT).show()
            onDestroy()
        }

        submittransaction.setOnClickListener {
            val intent = Intent(this, inputuser::class.java)
            try {
                val Pelayan=pelayan
                val Pelanggan=pelanggan
                val NomorMeja=nomorMeja
                val SopIga=sopIgaQty
                val NasiUduk=nasiUdukQty
                val MieGoreng=mieGorengQty
                val NasiGoreng=nasiGorengQty
                val EsTeh=esTehQty
                val EsJeruk=esJerukQty
                nextId++

                val id = nextId.toString()
                val transaction = transaction(NomorMeja, Pelanggan, Pelayan, SopIga, NasiUduk, MieGoreng, NasiGoreng, EsTeh, EsJeruk)
                ref.child(id).setValue(transaction).addOnSuccessListener {
                    Toast.makeText(this, "Data Berhasil Disimpan", Toast.LENGTH_SHORT).show()
                    startActivity(intent)
                }
            }catch (e: Exception){
                Toast.makeText(this, "Data tidak berhasil Disimpan, Silahkan Order Ulang!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
