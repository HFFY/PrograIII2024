package com.example.prograiii2024.room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.prograiii2024.dataclasses.Estudiante

@Dao
interface EstudianteDao {

    @Query("SELECT * FROM Estudiante")
    fun obtenerTodosLosEstudiante(): List<Estudiante>

    @Query("SELECT * FROM Estudiante WHERE id =:id")
    fun obtenerPorId(id: String): Estudiante

    @Update
    fun update(estudiante: Estudiante)

    @Insert
    fun insert(estudiante: Estudiante)

    @Insert
    fun insertarEstudiantes(estudiante: List<Estudiante>)
}