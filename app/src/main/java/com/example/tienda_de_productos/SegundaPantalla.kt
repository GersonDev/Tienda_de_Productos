package com.example.tienda_de_productos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SegundaPantalla : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda_pantalla)

        val explorarBtn: Button = findViewById(R.id.exploreButton)

        explorarBtn.setOnClickListener {
            startActivity(Intent(this, TerceraPantallaDescuentos::class.java))
        }
    }
}