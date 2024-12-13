package com.example.prograiii2024.room

import android.app.Application
import androidx.room.Room

class EstuduanteAppAccess : Application() {
    val room = Room
        .databaseBuilder(
            applicationContext,
            EstudianteDataBase::class.java,
            "Estudiantes"
        )
        .build()
}