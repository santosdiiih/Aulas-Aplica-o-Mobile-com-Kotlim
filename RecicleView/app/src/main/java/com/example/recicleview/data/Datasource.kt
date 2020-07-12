package com.example.recicleview.data

import com.example.recicleview.model.Artista

class Datasource {
    companion object {
        fun getArtist() : ArrayList<Artista>{
            var artistas = ArrayList<Artista>()

            artistas.add(Artista(100, "Day", 25, "A culpa é do meu signo", 6F))
            artistas.add(Artista(110, "carol Biazon", 25, "Deixa Rolar", 4F))
            artistas.add(Artista(120, "Atitude 67", 30, "Abacagin", 6F))
            artistas.add(Artista(1300, "Shawn Mendes", 25, "Señorita", 4F))
            artistas.add(Artista(140, "Kell Smith", 25, "Respeita as Mina", 3F))
            artistas.add(Artista(150, "AnaVitoria", 24, "Cecilia", 6F))
            artistas.add(Artista(160, "Gabriel Aplin", 30, "Home", 6F))
            artistas.add(Artista(170, "Iza", 33, "Você Não vive Sem mim", 5F))
            artistas.add(Artista(180, "Bruno Mars", 35, "Marry you", 6F))
        return artistas
        }
    }
}