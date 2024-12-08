package com.example.prograiii2024

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.prograiii2024.adapters.RecyclerEjemploAdapter.RecyclerEjemploAdapter
import com.example.prograiii2024.databinding.ActivityRecyclerEjemploBinding
import com.example.prograiii2024.dataclasses.Producto

class RecyclerEjemploActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRecyclerEjemploBinding

    private val recylcerEjemploAdapter by lazy {RecyclerEjemploAdapter()}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRecyclerEjemploBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        setUpRecyclerView()
    }

    fun setUpRecyclerView(){
        val listaDatos = mutableListOf(
            Producto(
                nombre = "Huevo",
                fechaDeVencimiento = "20/12/24",
                cantidad = 12
            ),
            Producto(
                nombre = "Jamon",
                fechaDeVencimiento = "16/01/25",
                cantidad = 50
            ),
            Producto(
                nombre = "Cereales",
                fechaDeVencimiento = "15/12/26",
                cantidad = 1
            ),
            Producto(
                nombre = "Avena",
                fechaDeVencimiento = "31/01/27",
                cantidad = 2
            ),
            Producto(
                nombre = "Avena",
                fechaDeVencimiento = "31/01/27",
                cantidad = 2
            ),
            Producto(
                nombre = "Avena",
                fechaDeVencimiento = "31/01/27",
                cantidad = 2
            ),
            Producto(
                nombre = "Avena",
                fechaDeVencimiento = "31/01/27",
                cantidad = 2
            ),
            Producto(
                nombre = "Avena",
                fechaDeVencimiento = "31/01/27",
                cantidad = 2
            ),
            Producto(
                nombre = "Avena",
                fechaDeVencimiento = "31/01/27",
                cantidad = 2
            ),
            Producto(
                nombre = "Avena",
                fechaDeVencimiento = "31/01/27",
                cantidad = 2
            ),
        )

        recylcerEjemploAdapter.addDataToList(listaDatos)

        binding.recyclerEjemplo.apply {
            layoutManager =
                LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
            adapter = recylcerEjemploAdapter
        }

        binding.recyclerEjemplo2.apply {
            layoutManager =
                LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
            adapter = recylcerEjemploAdapter
        }
    }
}