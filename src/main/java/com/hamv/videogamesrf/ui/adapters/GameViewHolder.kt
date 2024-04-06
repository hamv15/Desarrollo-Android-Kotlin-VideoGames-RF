package com.hamv.videogamesrf.ui.adapters

import androidx.recyclerview.widget.RecyclerView
import com.hamv.videogamesrf.data.remote.model.GameDTO
import com.hamv.videogamesrf.databinding.GameElementBinding

class GameViewHolder(private var binding: GameElementBinding): RecyclerView.ViewHolder(binding.root) {

    val ivThumbnail = binding.ivThumbnail

    fun bind(game: GameDTO){
        binding.tvTitle.text = game.title

    }

}