package com.sundevs.ihsan.belajarkotlin.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.support.v7.widget.RecyclerView
import com.sundevs.ihsan.belajarkotlin.model.News
import android.view.ViewGroup
import android.view.LayoutInflater
import com.sundevs.ihsan.belajarkotlin.R
import android.widget.TextView
import android.support.v7.widget.CardView
import android.view.View
import android.widget.ImageView
import com.bumptech.glide.Glide

/**
 * Created by
 * Name     : Ihsan Abdurahman
 * Email    : ihsanab31@gmail.com
 * WA       : 0878253827096
 * on Sunday, 26/03/2018
 * ------------------------------
 * This class for
 */
class NewsAdapater(var context: Context, var listNews: List<News>) : RecyclerView.Adapter<NewsAdapater.ViewHolder>() {


    @SuppressLint("InflateParams")
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.list_item_news, null, false)

        val layoutParams = RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT)
        v.layoutParams = layoutParams

        return ViewHolder(v)
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val news = listNews.get(position)
        Glide.with(context)
                .load(news.getImgNews())
                .placeholder(R.drawable.ic_null)
                .into(holder.imgNews)
        holder.lblTitleNews.text = news.getTitleNews()
        holder.lblDateNews.text = news.getDateNews().substring(0, 10) + " " + news.getDateNews().substring(11, 16)
        if (news.getAuthorNews() == null) {
            holder.lblAuthorNews.text = "Unknown Author"
        } else {
            holder.lblAuthorNews.text = news.getAuthorNews()
        }

    }


    override fun getItemCount(): Int = listNews.size

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val cvNews: CardView = itemView.findViewById(R.id.cv_news)
        val imgNews: ImageView = itemView.findViewById(R.id.img_news)
        val lblTitleNews: TextView = itemView.findViewById(R.id.title_news)
        val lblDateNews: TextView = itemView.findViewById(R.id.date_news)
        val lblAuthorNews: TextView = itemView.findViewById(R.id.author_news)

    }
}