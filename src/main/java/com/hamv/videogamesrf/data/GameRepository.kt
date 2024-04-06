package com.hamv.videogamesrf.data

import com.hamv.videogamesrf.data.remote.GamesApi
import com.hamv.videogamesrf.data.remote.model.GameDTO
import com.hamv.videogamesrf.data.remote.model.GameDetailDTO
import retrofit2.Call
import retrofit2.Retrofit

class GameRepository(private val retrofit: Retrofit) {

    private val gamesApi: GamesApi = retrofit.create(GamesApi::class.java)

    //Ya no es necesario utilizar suspend por como está implementada retrofit. Ya lo tiene
    fun getGames(url: String?): Call<List<GameDTO>>{
        return gamesApi.getGames(url)
    }

    suspend fun getGameDetail(id: String?): Call<GameDetailDTO>{
        return gamesApi.getGameDetail(id)
    }
}