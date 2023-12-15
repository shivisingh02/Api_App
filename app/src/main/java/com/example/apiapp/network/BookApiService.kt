package com.example.apiapp.network

import retrofit2.Retrofit
import retrofit2.converter.scalars.ScalarsConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

const val BaseUrl = "https://books.googleapis.com/books/v1"
const val Query = "q"
const val MaxResults = "maxResults"
const val  PrintType = "printType"
private val retrofit = Retrofit.Builder()
    .addConverterFactory(ScalarsConverterFactory.create())
    .baseUrl(BaseUrl)
    .build()

interface BookApiService {
     //suspend means can only be used in background thread
  @GET("volumes") //to verify question mark
    suspend fun getBooks(
       @Query(Query)
        query : String ,
       @Query(MaxResults)
        results: String,
       @Query(PrintType)
        type: String
    ) : String
}

object BookApi{
    val retrofitService: BookApiService by lazy {
        retrofit.create(BookApiService::class.java)
    }
}
