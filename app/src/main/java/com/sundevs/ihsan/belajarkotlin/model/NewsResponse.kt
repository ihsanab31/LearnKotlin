package com.sundevs.ihsan.belajarkotlin.model

import com.google.gson.annotations.SerializedName

/**
 * Created by
 * Name     : Ihsan Abdurahman
 * Email    : ihsanab31@gmail.com
 * WA       : 0878253827096
 * on Sunday, 26/03/2018
 * ------------------------------
 * This class for
 */

class NewsResponse {
    @SerializedName("status")
    private var status: String? = null

    @SerializedName("totalResults")
    private var totalResults: String? = null

    @SerializedName("articles")
    private var newsList: List<News>? = null

    fun getStatus(): String? {
        return status
    }

    fun setStatus(status: String) {
        this.status = status
    }

    fun getTotalResults(): String? {
        return totalResults
    }

    fun setTotalResults(totalResults: String) {
        this.totalResults = totalResults
    }

    fun getNewsList(): List<News>? {
        return newsList
    }

    fun setNewsList(newsList: List<News>) {
        this.newsList = newsList
    }

}