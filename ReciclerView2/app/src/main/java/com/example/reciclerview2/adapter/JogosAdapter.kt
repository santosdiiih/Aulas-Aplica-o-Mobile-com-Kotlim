package com.example.reciclerview2.adapter
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.reciclerview2.R
import com.example.reciclerview2.model.Jogo
import kotlinx.android.synthetic.main.layout_lista_jogos.view.*

class JogosAdapter ( var listaJogos: ArrayList<Jogo>) : RecyclerView.Adapter <JogosAdapter.JogoViewHolder> () {

    // primeiro modo a ser executado quando for criar a lista
    override fun getItemCount(): Int {
        return listaJogos.size
    }

    // é chamado toda vez que algo for criado na tela
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): JogoViewHolder {

        val intemView = LayoutInflater.from(parent.context).inflate(R.layout.layout_lista_jogos, parent, false)
        return JogoViewHolder(intemView)
    }

    override fun onBindViewHolder(holder: JogoViewHolder, position: Int) {
        val jogo = listaJogos[position]
        holder.bind(jogo)
    }

    class JogoViewHolder (itemView: View) : RecyclerView.ViewHolder (itemView) {
        fun bind (jogo: Jogo) {

            itemView.textNomeJogo.text = jogo.nomeJogo
            itemView.textConsole.text = jogo.console
            itemView.notaJogo.rating = jogo.notaJogo

        }
    }
}