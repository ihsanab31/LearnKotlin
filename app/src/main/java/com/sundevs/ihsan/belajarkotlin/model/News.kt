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
class News {
    @SerializedName("urlToImage") private
    var imgNews: String = null.toString()
    @SerializedName("title") private
    lateinit var titleNews: String
    @SerializedName("publishedAt") private
    lateinit var dateNews: String
    @SerializedName("author") private
    var authorNews: String = null.toString()
    @SerializedName("description") private
    lateinit var contentNews: String
    @SerializedName("url") private
    lateinit var sourceNews: String

    fun News(imgNews: String, titleNews: String, dateNews: String, authorNews: String, contentNews: String, sourceNews: String) {
        this.imgNews = imgNews
        this.titleNews = titleNews
        this.dateNews = dateNews
        this.authorNews = authorNews
        this.contentNews = contentNews
        this.sourceNews = sourceNews
    }

    fun getImgNews(): String {
        return imgNews
    }

    fun getTitleNews(): String {
        return titleNews
    }

    fun getDateNews(): String {
        return dateNews
    }

    fun getAuthorNews(): String {
        return authorNews
    }

    fun getContentNews(): String {
        return contentNews
    }

    fun getSourceNews(): String {
        return sourceNews
    }
}