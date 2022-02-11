package com.oceanbrasil.jornada_android_fev22_jetpack_arquitetura.viewmodel

import androidx.lifecycle.ViewModel
import com.oceanbrasil.jornada_android_fev22_jetpack_arquitetura.model.domain.Personagem

class PersonagensViewModel : ViewModel() {
    val personagens: List<Personagem>

    init {
        val harryPotter = Personagem("Harry Potter", "https://hp-api.herokuapp.com/images/harry.jpg")
        val hermione = Personagem("Hermione Granger", "https://hp-api.herokuapp.com/images/hermione.jpeg")

        personagens = listOf(harryPotter, hermione)
    }
}
