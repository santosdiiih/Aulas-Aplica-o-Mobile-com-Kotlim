package com.example.recicleview.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recicleview.R
import com.example.recicleview.model.Artista
import kotlinx.android.synthetic.main.layout_artista_holder.view.*


class ArtistaRecycleAdapter (var listaArtista: ArrayList<Artista>) :
    RecyclerView.Adapter <ArtistaRecycleAdapter.ArtistaViewHolder> (){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArtistaViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.layout_artista_holder, parent, false)
        return ArtistaViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return listaArtista.size
    }

    override fun onBindViewHolder(holder: ArtistaViewHolder, position: Int) {
        val artista =  listaArtista[position]
        holder.bind(artista)
    }

    class ArtistaViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView){

        fun bind (artista: Artista){
            itemView.nome.text = artista.name
            itemView.idade.text = artista.idade.toString()
            itemView.hits.text = artista.hits
            itemView.notaMusica.rating = artista.hate.toFloat()


        }
    }
}