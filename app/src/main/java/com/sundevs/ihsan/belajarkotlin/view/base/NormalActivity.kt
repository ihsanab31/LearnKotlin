package com.sundevs.ihsan.belajarkotlin.view.base




/**
 * Created by
 * Name     : Ihsan Abdurahman
 * Email    : ihsanab31@gmail.com
 * WA       : 0878253827096
 * on Sunday, 26/03/2018
 * ------------------------------
 * This class for
 */
abstract class NormalActivity : BaseActivity(){
    abstract fun isActionBarEnable(): Boolean

    override fun onBindView() {
        super.onBindView()
        initActionBar()
    }

    private fun initActionBar() {
        val actionBar = supportActionBar
        if (actionBar != null) {
            if (!isActionBarEnable()) {
                actionBar.hide()
            }
        }
    }
}