package com.example.tienda_de_productos.data.api

class GetProductoResponse(
    val title: String,
    val subTitle: String = "Upto",
    val cantidad: String,
    val descuento: String = "Discount"
)