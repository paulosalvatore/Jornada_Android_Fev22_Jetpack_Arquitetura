package com.oceanbrasil.jornada_android_fev22_jetpack_arquitetura.viewmodel

import androidx.lifecycle.ViewModel
import com.oceanbrasil.jornada_android_fev22_jetpack_arquitetura.model.repository.PersonagensRepository

class PersonagensViewModel : ViewModel() {
    private val personagensRepository = PersonagensRepository()

    val personagens = personagensRepository.personagens
}
