package com.broniboy.chacknorrisapp.data.remote

import com.broniboy.chacknorrisapp.data.remote.response.JokeResp
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query

interface ChuckNorrisApiService {

    @GET("jokes/random")
    fun getJoke(
        @Query("category") category: String? = null
    ): Observable<JokeResp>

    @GET("jokes/categories")
    fun getCategories(): List<String>
}