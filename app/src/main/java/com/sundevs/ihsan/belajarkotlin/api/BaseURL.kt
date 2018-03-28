package com.sundevs.ihsan.belajarkotlin.api

/**
 * Created by
 * Name     : Ihsan Abdurahman
 * Email    : ihsanab31@gmail.com
 * WA       : 0878253827096
 * on Sunday, 26/03/2018
 * ------------------------------
 * This class for
 */

class BaseURL {
    companion object {
         private val URL_API: String = "https://newsapi.org/"

        fun getAPIService(): EndPoint {
            return APIClient.getClient(URL_API)!!.create(EndPoint::class.java)
        }
    }

}