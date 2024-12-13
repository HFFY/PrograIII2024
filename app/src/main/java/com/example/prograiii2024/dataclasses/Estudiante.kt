package com.example.prograiii2024.dataclasses

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Estudiante(
    @PrimaryKey
    val id: String,
    val nombre: String,
    val codigo: Int,
    val edad: Int
)
