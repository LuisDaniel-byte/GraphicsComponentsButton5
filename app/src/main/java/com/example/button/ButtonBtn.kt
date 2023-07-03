package com.example.button

import android.app.Activity
import android.os.Bundle
import android.widget.Button
import android.widget.ListView
import android.widget.TextView

class ButtonBtn : Activity() {
    lateinit var  tvContador : TextView;
    lateinit var  BtnButton : Button;
    lateinit var LvLista : ListView;
    var contador = 0;



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.btn_button)
        BtnButton = findViewById(R.id.button)

        BtnButton.setOnClickListener  {
            tvContador.text = "Boton presionado"

        }
    }
}