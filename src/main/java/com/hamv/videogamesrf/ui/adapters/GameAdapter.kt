package com.hamv.videogamesrf.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.hamv.videogamesrf.data.remote.model.GameDTO
import com.hamv.videogamesrf.databinding.GameElementBinding

class GameAdapter(
    private val games: List<GameDTO>,
    private val onGameClicked: (GameDTO) -> Unit
): RecyclerView.Adapter<GameViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GameViewHolder {
        val binding = GameElementBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return GameViewHolder(binding)
    }


    override fun getItemCount(): Int {
        return games.size
    }


    override fun onBindViewHolder(holder: GameViewHolder, position: Int) {
        val game = games[position]

        holder.bind(game)

        Glide.with(holder.itemView.context)
        Glide.with(holder.itemView.context)
            .load(game.thumbnail)
            .into(holder.ivThumbnail)

        //Con picasso hubiera sido
        /*
        Picasso.get()
            .load(game.thumbnail)
            .into(holder.ivThumbnail)
        * */

        holder.itemView.setOnClickListener{
            onGameClicked(game)
        }
    }

}