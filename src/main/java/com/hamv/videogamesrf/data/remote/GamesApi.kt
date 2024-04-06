package com.hamv.videogamesrf.data.remote

import com.hamv.videogamesrf.data.remote.model.GameDTO
import com.hamv.videogamesrf.data.remote.model.GameDetailDTO
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query
import retrofit2.http.Url

//Seria el equivalente al DAO en el ROOM
interface GamesApi {
    //https://www.serverbpw.com/cm/games/games_list.php
    @GET
    fun getGames(
        @Url url: String?
    ): Call<List<GameDTO>>

    //https://www.serverbpw.com/cm/games/game_detail.php?id=21357
    @GET("cm/games/game_detail.php?")
    fun getGameDetail(
        @Query("id") id: String?
    ): Call<GameDetailDTO>

    //Para generar endpoints del estilo
    //https://www.serverbpw.com/cm/games/21357/hugo
    @GET("cm/games/{id}/{name}")
    fun getGameTest(
        @Path("id") id: String?,
        @Path("name") name: String?
    ): Call<GameDetailDTO>
}