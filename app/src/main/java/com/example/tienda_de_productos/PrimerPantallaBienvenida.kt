package com.example.tienda_de_productos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView

class PrimerPantallaBienvenida : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_primer_pantalla_bienvenida)

        val avanzarbtn:ImageView=findViewById(R.id.avanzar_Button)

        avanzarbtn.setOnClickListener {
            startActivity(Intent(this,SegundaPantalla::class.java))
        }
    }
}