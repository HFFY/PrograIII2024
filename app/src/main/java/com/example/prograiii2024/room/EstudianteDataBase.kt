package com.example.prograiii2024.room

import androidx.core.app.Person
import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.prograiii2024.dataclasses.Estudiante

@Database(
    entities = [Estudiante::class],
    version = 1
)
abstract class EstudianteDataBase: RoomDatabase() {
    abstract fun estudianteDao(): EstudianteDao
}