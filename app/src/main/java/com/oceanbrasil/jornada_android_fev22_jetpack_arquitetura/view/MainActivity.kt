package com.oceanbrasil.jornada_android_fev22_jetpack_arquitetura.view

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.oceanbrasil.jornada_android_fev22_jetpack_arquitetura.R
import com.oceanbrasil.jornada_android_fev22_jetpack_arquitetura.viewmodel.PersonagensViewModel

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val personagensViewModel = ViewModelProvider(this).get(PersonagensViewModel::class.java)

        val personagens = personagensViewModel.personagens

        // Exibindo uma mensagem de lista carregando
        Toast.makeText(this, "Dados carregando, aguarde...", Toast.LENGTH_SHORT).show()

        personagens.observe(this) {
            Toast.makeText(this, "Dados carregados!!", Toast.LENGTH_SHORT).show()

            // Esse código acontecerá quando eu tiver dados disponíveis dentro desse LiveData

            // Inicialização da RecyclerView
            val rvPersonagens = findViewById<RecyclerView>(R.id.rvPersonagens)
            rvPersonagens.layoutManager = LinearLayoutManager(this)
            rvPersonagens.adapter = PersonagensAdapter(it)
        }
    }
}
