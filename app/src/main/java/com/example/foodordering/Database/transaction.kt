package com.example.foodordering.Database

class transaction(var nomorMeja : Int, var namaPelayan : String, var namaPelanggan : String, var sopIgaValue : Int, var nasiUdukValue: Int,
    var mieGorengValue: Int, var nasiGorengValue: Int, var esTehValue: Int, var esJerukValue: Int) {
    constructor():this(0,"","",0,
        0,0,0,0,0)
}