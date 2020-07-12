package com.example.reciclerview2.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.reciclerview2.R
import com.example.reciclerview2.adapter.JogosAdapter
import com.example.reciclerview2.datasource.Datasource
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.toolbar.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        iniciarReciclerView()

        insertToolbar()

        buttonCadastrarJogo.setOnClickListener(this)
    }

    private fun insertToolbar() {
        setSupportActionBar(toolbar)
        supportActionBar!!.title = "My game app"
    }

    private fun iniciarReciclerView() {

        reciclerViewJogos.layoutManager = LinearLayoutManager(this)
        reciclerViewJogos.adapter = JogosAdapter(Datasource.getJogos())

    }

    override fun onClick(v: View) {

        if (v.id == R.id.buttonCadastrarJogo) {
            val  intent = Intent(this, CadastroJogoActivity::class.java)
            startActivity(intent)
        }
    }
}
