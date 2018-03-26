package com.sundevs.ihsan.belajarkotlin.view.activity

import android.app.ProgressDialog
import android.os.Bundle
import com.sundevs.ihsan.belajarkotlin.R
import com.sundevs.ihsan.belajarkotlin.view.base.NormalActivity
import com.sundevs.ihsan.belajarkotlin.api.EndPoint
import com.sundevs.ihsan.belajarkotlin.model.News
import android.support.v7.widget.RecyclerView
import butterknife.BindView
import com.sundevs.ihsan.belajarkotlin.adapter.NewsAdapater
import android.support.v7.widget.LinearLayoutManager
import com.sundevs.ihsan.belajarkotlin.api.BaseURL
import android.widget.Toast
import com.sundevs.ihsan.belajarkotlin.model.NewsResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class MainActivity : NormalActivity() {
    @BindView(R.id.rv_news)
    lateinit var rvNews: RecyclerView
    private var adapter: NewsAdapater? = null
    var listNews: List<News> = ArrayList()
    val category = "entertainment"
    var loading: ProgressDialog? = null
    var apiService: EndPoint? = null

    override fun getActivityView(): Int {
        return R.layout.activity_main
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        apiService = BaseURL.getAPIService()
        adapter = NewsAdapater(this, listNews)
        rvNews.setHasFixedSize(true)
        rvNews.layoutManager = LinearLayoutManager(this)
        rvNews.adapter = adapter
        refresh()
    }


    override fun isActionBarEnable(): Boolean {
        return false
    }

    fun refresh() {
        loading = ProgressDialog.show(this, null, "Harap Tunggu...", true, false)
        apiService!!.getListNews("id", category, "a9c6552887f94c429a093f3f71fa7557").enqueue(object : Callback<NewsResponse> {
            override fun onResponse(call: Call<NewsResponse>, response: Response<NewsResponse>) {
                if (response.isSuccessful) {
                    loading!!.dismiss()
                    listNews = response.body()!!.getNewsList()!!
                    rvNews!!.adapter = NewsAdapater(applicationContext, listNews)
                    adapter!!.notifyDataSetChanged()
                } else {
                    loading!!.dismiss()
                    Toast.makeText(applicationContext, "Failed to Fetch Data !", Toast.LENGTH_SHORT).show()
                }
            }

            override fun onFailure(call: Call<NewsResponse>, t: Throwable) {
                loading!!.dismiss()
                Toast.makeText(applicationContext, "Failed to Connect Internet !", Toast.LENGTH_SHORT).show()
            }
        })
    }
}
