package com.clevmania.recycleranims

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        requestWindowFeature(Window.FEATURE_NO_TITLE)
//        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN)

        setContentView(R.layout.activity_main)
        populateView()
//        supportActionBar?.hide()
    }

    private fun populateView(){
        val newsList = arrayListOf<NewsModel>()
        newsList.add(NewsModel("Pursuit Fellowship",getString(R.string.lorel),"22-12-2019"))
        newsList.add(NewsModel("Pursuit Fellowship",getString(R.string.lorel),"17-12-2019"))
        newsList.add(NewsModel("Pursuit Fellowship",getString(R.string.lorel),"1-12-2019"))
        newsList.add(NewsModel("Pursuit Fellowship",getString(R.string.lorel),"8-12-2019"))
        newsList.add(NewsModel("Pursuit Fellowship",getString(R.string.lorel),"13-12-2019"))
        newsList.add(NewsModel("Pursuit Fellowship",getString(R.string.lorel),"6-12-2019"))
        newsList.add(NewsModel("Pursuit Fellowship",getString(R.string.lorel),"17-12-2019"))
        newsList.add(NewsModel("Pursuit Fellowship",getString(R.string.lorel),"12-12-2019"))
        newsList.add(NewsModel("Pursuit Fellowship",getString(R.string.lorel),"12-12-2019"))
        newsList.add(NewsModel("Pursuit Fellowship",getString(R.string.lorel),"12-12-2019"))
        newsList.add(NewsModel("Pursuit Fellowship",getString(R.string.lorel),"12-12-2019"))
        newsList.add(NewsModel("Pursuit Fellowship",getString(R.string.lorel),"2-08-2019"))
        rv_news.setHasFixedSize(true)
        rv_news.layoutManager = LinearLayoutManager(this)
        val adapter = NewsAdapter(newsList)
        rv_news.adapter = adapter
    }

    private fun generateRandomDate(): String{
        return "02-12-2019"
    }
}
