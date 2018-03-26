package com.sundevs.ihsan.belajarkotlin

import android.content.Context
import android.support.multidex.MultiDexApplication
import android.support.multidex.MultiDex

/**
 * Created by
 * Name     : Ihsan Abdurahman
 * Email    : ihsanab31@gmail.com
 * WA       : 0878253827096
 * on Sunday, 26/03/2018
 * ------------------------------
 * This class for
 */

class NewsApp  : MultiDexApplication() {

     override fun attachBaseContext(newBase: Context) {
        super.attachBaseContext(newBase)
        MultiDex.install(this)
    }
}