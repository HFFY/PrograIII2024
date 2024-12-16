package com.example.prograiii2024.room

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.example.prograiii2024.dataclasses.Estudiante

@Dao
interface EstudianteDao {

    @Query("SELECT * FROM Estudiante")
    suspend fun obtenerTodosLosEstudiante(): List<Estudiante>

    @Query("SELECT * FROM Estudiante WHERE id =:id")
    suspend fun obtenerPorId(id: String): Estudiante

    @Update
    suspend fun update(estudiante: Estudiante)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(estudiante: Estudiante)

    @Insert
    suspend fun insertarEstudiantes(estudiante: List<Estudiante>)
}