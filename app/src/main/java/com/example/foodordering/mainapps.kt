package com.example.foodordering

import android.os.Bundle
import android.widget.Button
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

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainapps);
    }
}