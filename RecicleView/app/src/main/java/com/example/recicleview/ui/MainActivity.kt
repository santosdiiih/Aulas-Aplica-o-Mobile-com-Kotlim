package com.example.recicleview.ui

import android.content.Intent
import  androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recicleview.R
import com.example.recicleview.adapter.ArtistaRecycleAdapter
import com.example.recicleview.data.Datasource
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var recyclerView = recycleViewArtista
        recyclerView.layoutManager = LinearLayoutManager(applicationContext)
        recyclerView.adapter = ArtistaRecycleAdapter(Datasource.getArtist())
        
        buttonCadastrarArtista.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        if(v.id == R.id.buttonCadastrarArtista){
            val intent = Intent(this, cadastroDeArtistaActivity::class.java)
            startActivity(intent)
        }
    }
}
