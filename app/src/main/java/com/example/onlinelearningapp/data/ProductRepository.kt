package com.example.onlinelearningapp.data

import com.example.onlinelearningapp.data.model.Product
import kotlinx.coroutines.flow.Flow

interface ProductsRepository {
    suspend fun getProductList(): Flow<Result<List<Product>>>
}