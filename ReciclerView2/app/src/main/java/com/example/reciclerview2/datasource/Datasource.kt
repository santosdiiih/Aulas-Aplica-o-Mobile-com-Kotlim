package com.example.reciclerview2.datasource

import com.example.reciclerview2.model.Jogo

class Datasource {

    companion object  {
        fun getJogos() : ArrayList<Jogo>{
            var jogos = ArrayList<Jogo>()

            jogos.add(Jogo(100, "residente Evil", 5.0F, "PS-4"))
            jogos.add(Jogo(110, "Zomby Army", 6.5F, "PC"))
            jogos.add(Jogo(120, "The Last of Us Part II ", 30.0F, "PS-4"))
            jogos.add(Jogo(130, "GFTO", 4.0F, "PC"))
            jogos.add(Jogo(140, "Mario e Sonic ", 6.0F, "Switch"))
            jogos.add(Jogo(150, "GRID", 3.0F, "PC"))
            jogos.add(Jogo(160, "Concrete Genie", 2.0F, "Switc"))
            jogos.add(Jogo(170, "Blazing Chrome", 2.0F, "XBOX-ONE"))
            jogos.add(Jogo(180, "Gears of War 5", 5.0F, "XBOX-ONE"))
            jogos.add(Jogo(190, "Gato Roboto", 3.0F, "PC"))
            jogos.add(Jogo(200, "Castlelvania Anniversary", 4.0F, "XBOX-ONE"))
            return jogos
        }
    }

}