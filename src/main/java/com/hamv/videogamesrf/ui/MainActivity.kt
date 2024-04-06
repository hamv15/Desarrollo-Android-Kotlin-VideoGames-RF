package com.hamv.videogamesrf.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.lifecycleScope
import com.hamv.videogamesrf.R
import com.hamv.videogamesrf.data.GameRepository
import com.hamv.videogamesrf.data.remote.RetrofitHelper
import com.hamv.videogamesrf.data.remote.model.GameDTO
import com.hamv.videogamesrf.databinding.ActivityMainBinding
import com.hamv.videogamesrf.ui.fragments.GamesListFragment
import com.hamv.videogamesrf.utils.Constants
import kotlinx.coroutines.launch
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private lateinit var repository: GameRepository
    private lateinit var retrofit: Retrofit

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if (savedInstanceState == null){
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, GamesListFragment())
                .commit()
        }

        /*
        //Con el fin de probar la conexion y ver los logs
        retrofit = RetrofitHelper().getRetrofit()
        repository = GameRepository(retrofit)

        lifecycleScope.launch {

            val call: Call<List<GameDTO>> = repository.getGames("cm/games/games_list.php")

            call.enqueue(object : Callback<List<GameDTO>> {
                override fun onResponse(p0: Call<List<GameDTO>>, response: Response<List<GameDTO>>) {
                    //Respuesta del server
                    Log.d(Constants.LOGTAG, "Respuesta recibida: ${response.body()}")
                }

                override fun onFailure(p0: Call<List<GameDTO>>, error: Throwable) {
                    //Manejo del error
                    Toast.makeText(
                        this@MainActivity,
                        "Error en la conexión: ${error.message}",
                        Toast.LENGTH_SHORT
                    ).show()
                }

            })

        }*/

    }
}