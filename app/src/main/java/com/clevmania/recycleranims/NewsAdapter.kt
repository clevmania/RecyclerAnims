package com.clevmania.recycleranims

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_news.view.*

class NewsAdapter(private val newsList : List<NewsModel>) : RecyclerView.Adapter<NewsAdapter.NewsViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_news,parent,false)
        return NewsViewHolder(view)
    }

    override fun getItemCount() = newsList.size

    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {
        holder.bindViews(newsList[position])
    }

    class NewsViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        fun bindViews(newsModel: NewsModel) {
            itemView.tv_date.text = newsModel.date
            itemView.tv_description.text = newsModel.description
            itemView.tv_title.text = newsModel.title

            itemView.iv_news_icon.animation = AnimationUtils
                .loadAnimation(itemView.context,R.anim.fade_transition)

            itemView.view.animation = AnimationUtils
                .loadAnimation(itemView.context,R.anim.fade_scale)
        }
    }

}