package com.example.prograiii2024.dataclasses

import java.io.Serializable

data class Producto(
    val fechaDeVencimiento: String,
    val nombre: String,
    val cantidad: Int
): Serializable
