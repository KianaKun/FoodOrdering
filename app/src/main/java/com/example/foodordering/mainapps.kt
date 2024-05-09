package com.example.foodordering

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class mainapps : AppCompatActivity() {
    private lateinit var buttonAddSopIga: Button
    private lateinit var buttonAddNasiUduk: Button
    private lateinit var buttonAddMieGoreng: Button
    private lateinit var buttonAddNasiGoreng: Button
    private lateinit var buttonAddEsTeh: Button
    private lateinit var buttonAddEsJeruk: Button
    private lateinit var buttonMinSopIga: Button
    private lateinit var buttonMinNasiUduk: Button
    private lateinit var buttonMinMieGoreng: Button
    private lateinit var buttonMinNasiGoreng: Button
    private lateinit var buttonMinEsTeh: Button
    private lateinit var buttonMinEsJeruk: Button
    private lateinit var sopIgaValue: TextView
    private lateinit var nasiUdukValue: TextView
    private lateinit var mieGorengValue: TextView
    private lateinit var nasiGorengValue: TextView
    private lateinit var esTehValue: TextView
    private lateinit var esJerukValue: TextView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainapps);

        // Value Button
        buttonAddSopIga=findViewById(R.id.buttonAddSopIga)
        buttonMinSopIga=findViewById(R.id.buttonMinSopIga)
        buttonAddNasiUduk=findViewById(R.id.buttonAddNasiUduk)
        buttonMinNasiUduk=findViewById(R.id.buttonMinNasiUduk)
        buttonAddMieGoreng=findViewById(R.id.buttonAddMieGoreng)
        buttonMinMieGoreng=findViewById(R.id.buttonMinMieGoreng)
        buttonAddNasiGoreng=findViewById(R.id.buttonAddNasiGoreng)
        buttonMinNasiGoreng=findViewById(R.id.buttonMinNasiGoreng)
        buttonAddEsTeh=findViewById(R.id.buttonAddEsTeh)
        buttonMinEsTeh=findViewById(R.id.buttonMinEsTeh)
        buttonAddEsJeruk=findViewById(R.id.buttonAddEsJeruk)
        buttonMinEsJeruk=findViewById(R.id.buttonMinEsJeruk)

        //Value TextView
        sopIgaValue=findViewById(R.id.sopIgaValue)
        nasiUdukValue=findViewById(R.id.nasiUdukValue)
        mieGorengValue=findViewById(R.id.mieGorengValue)
        nasiGorengValue=findViewById(R.id.nasiGorengValue)
        esTehValue=findViewById(R.id.esTehValue)
        esJerukValue=findViewById(R.id.esJerukValue)

        buttonAddSopIga.setOnClickListener{
            var valueSopIga = sopIgaValue.text.toString().toInt()
            valueSopIga++
            sopIgaValue.text = valueSopIga.toString()
        }
        buttonMinSopIga.setOnClickListener{
            var valueSopIga = sopIgaValue.text.toString().toInt()
            valueSopIga--
            sopIgaValue.text = valueSopIga.toString()
        }
        buttonAddNasiUduk.setOnClickListener{
            var valueNasiUduk = nasiUdukValue.text.toString().toInt()
            valueNasiUduk++
            nasiUdukValue.text = valueNasiUduk.toString()
        }
        buttonMinNasiUduk.setOnClickListener{
            var valueNasiUduk = nasiUdukValue.text.toString().toInt()
            valueNasiUduk--
            nasiUdukValue.text = valueNasiUduk.toString()
        }
        buttonAddMieGoreng.setOnClickListener{
            var valueMieGoreng = mieGorengValue.text.toString().toInt()
            valueMieGoreng++
            mieGorengValue.text = valueMieGoreng.toString()
        }
        buttonMinMieGoreng.setOnClickListener{
            var valueMieGoreng = mieGorengValue.text.toString().toInt()
            valueMieGoreng--
            mieGorengValue.text = valueMieGoreng.toString()
        }
        buttonAddNasiGoreng.setOnClickListener{
            var valueNasiGoreng = nasiGorengValue.text.toString().toInt()
            valueNasiGoreng++
            nasiGorengValue.text = valueNasiGoreng.toString()
        }
        buttonMinNasiGoreng.setOnClickListener {
            var valueNasiGoreng = nasiGorengValue.text.toString().toInt()
            valueNasiGoreng--
            nasiGorengValue.text = valueNasiGoreng.toString()
        }
        buttonAddEsTeh.setOnClickListener {
            var valueEsTeh = esTehValue.text.toString().toInt()
            valueEsTeh++
            esTehValue.text = valueEsTeh.toString()
        }
        buttonMinEsTeh.setOnClickListener {
            var valueEsTeh = esTehValue.text.toString().toInt()
            valueEsTeh--
            esTehValue.text = valueEsTeh.toString()
        }
        buttonAddEsJeruk.setOnClickListener {
            var valueEsJeruk = esJerukValue.text.toString().toInt()
            valueEsJeruk++
            esJerukValue.text = valueEsJeruk.toString()
        }
        buttonMinEsJeruk.setOnClickListener {
            var valueEsJeruk = esJerukValue.text.toString().toInt()
            valueEsJeruk--
            esJerukValue.text = valueEsJeruk.toString()
        }
    }
}