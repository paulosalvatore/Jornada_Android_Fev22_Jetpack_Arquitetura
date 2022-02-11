package com.oceanbrasil.jornada_android_fev22_jetpack_arquitetura.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.oceanbrasil.jornada_android_fev22_jetpack_arquitetura.R
import com.oceanbrasil.jornada_android_fev22_jetpack_arquitetura.viewmodel.PersonagensViewModel

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val personagensViewModel = ViewModelProvider(this).get(PersonagensViewModel::class.java)

        val personagens = personagensViewModel.personagens

        // Exemplo de atualização
        val tvPersonagens = findViewById<TextView>(R.id.tvPersonagens)

        tvPersonagens.text = ""
        personagens.forEach {
            tvPersonagens.append(it.nome + "\n")
        }
    }
}
