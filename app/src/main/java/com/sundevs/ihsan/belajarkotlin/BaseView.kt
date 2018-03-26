package com.sundevs.ihsan.belajarkotlin

import android.support.annotation.StringRes

/**
 * Created by
 * Name     : Ihsan Abdurahman
 * Email    : ihsanab31@gmail.com
 * WA       : 0878253827096
 * on Sunday, 26/03/2018
 * ------------------------------
 * This class for
 */
interface BaseView {

    fun  showProgressDialog( message : String )

    fun showProgressDialog(@StringRes message: Int)

    fun dismissProgressDialog()

    fun showMessage(message: String)

    fun showMessage(@StringRes message: Int)
}