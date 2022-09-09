package com.example.tienda_de_productos.data.api

import retrofit2.http.*

interface ProductoApi {
    @GET("musicas")
    suspend fun getMusicas(): List<GetProductoResponse>

    @POST("musicas")
    suspend fun createBrand(
        @Body brandRequest: ProductoRequest
    ): ProductoRequest

    @PUT
    suspend fun updateBrand()

    @DELETE
    suspend fun deleteBrand()
}