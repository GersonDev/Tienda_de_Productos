package com.example.tienda_de_productos.data.datasources

data class RemoteDataSource (
    val title: String,
    val subTitle: String = "Upto",
    val cantidad: String,
    val descuento: String
)