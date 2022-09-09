package com.example.tienda_de_productos.domain.models

data class Producto(
    val title: String,
    val subTitle: String = "Upto",
    val cantidad: String,
    val descuento: String = "Discount"
)
