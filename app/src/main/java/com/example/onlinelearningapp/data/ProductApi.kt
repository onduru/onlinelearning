package com.example.onlinelearningapp.data

import com.example.onlinelearningapp.data.model.Products
import retrofit2.http.GET

interface ProductApi {
    @GET("products")
    suspend fun getProductsList(): Products

    companion object{
        const val BASE_URL ="https://dummyjson.com/"
    }
}