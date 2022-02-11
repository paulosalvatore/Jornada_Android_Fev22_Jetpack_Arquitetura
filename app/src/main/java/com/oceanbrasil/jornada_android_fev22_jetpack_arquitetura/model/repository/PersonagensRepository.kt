package com.oceanbrasil.jornada_android_fev22_jetpack_arquitetura.model.repository

import androidx.lifecycle.MutableLiveData
import com.oceanbrasil.jornada_android_fev22_jetpack_arquitetura.model.domain.Personagem
import java.util.*
import kotlin.concurrent.timerTask

class PersonagensRepository {
    val personagens = MutableLiveData<List<Personagem>>()

    init {
        val timer = Timer()

        timer.schedule(
            timerTask {
                // Simulando uma requisição na web que leva um tempo para acontecer

                val harryPotter = Personagem("Harry Potter", "https://hp-api.herokuapp.com/images/harry.jpg")
                val hermione = Personagem("Hermione Granger", "https://hp-api.herokuapp.com/images/hermione.jpeg")

                personagens.postValue(listOf(harryPotter, hermione))
            }, 2000
        )
    }
}
