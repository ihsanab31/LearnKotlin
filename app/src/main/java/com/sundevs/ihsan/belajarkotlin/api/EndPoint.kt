package com.sundevs.ihsan.belajarkotlin.api

import com.sundevs.ihsan.belajarkotlin.model.NewsResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query


/**
 * Created by
 * Name     : Ihsan Abdurahman
 * Email    : ihsanab31@gmail.com
 * WA       : 0878253827096
 * on Sunday, 26/03/2018
 * ------------------------------
 * This class for
 */

interface EndPoint {

    @GET("/v2/top-headlines")
    fun getListNews(
            @Query("country") country: String,
            @Query("category") category: String,
            @Query("apiKey") apiKey: String): Call<NewsResponse>
}