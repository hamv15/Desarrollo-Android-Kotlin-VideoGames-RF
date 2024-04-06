package com.hamv.videogamesrf.application

import android.app.Application
import com.hamv.videogamesrf.data.GameRepository
import com.hamv.videogamesrf.data.remote.RetrofitHelper

class VideoGamesRFApp: Application() {

    private val retrofit by lazy {
        RetrofitHelper().getRetrofit()
    }

    val repository by lazy {
        GameRepository(retrofit)
    }

}