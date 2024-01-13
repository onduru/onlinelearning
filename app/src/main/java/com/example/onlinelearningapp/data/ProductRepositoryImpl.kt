package com.example.onlinelearningapp.data

import com.example.onlinelearningapp.data.model.Product
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import okio.IOException
import retrofit2.HttpException

class ProductRepositoryImpl(
    private val productApi: ProductApi
): ProductsRepository {
    override suspend fun getProductList(): Flow<Result<List<Product>>> {

        return flow {
            val productsFromApi = try{
                productApi.getProductsList()
            } catch (e: IOException){
                e.printStackTrace()
                emit(Result.Error(message = "Error Loading Products"))
                return@flow
            }catch (e: HttpException){
                e.printStackTrace()
                emit(Result.Error(message = "Error Loading Products"))
                return@flow

            }
            catch (e: Exception) {
                e.printStackTrace()
                emit(Result.Error(message = "Error Loading Products"))
                return@flow
            }

            emit(Result.Success(productsFromApi.products))
        }
    }
}






































































































































