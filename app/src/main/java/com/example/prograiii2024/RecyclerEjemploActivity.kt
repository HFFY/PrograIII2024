package com.example.prograiii2024

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.prograiii2024.adapters.RecyclerEjemploAdapter.RecyclerEjemploAdapter
import com.example.prograiii2024.databinding.ActivityRecyclerEjemploBinding

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
            "Este es un ejemplo de recycler view",
            "Este es un ejemplo de recycler view",
            "Este es un ejemplo de recycler view",
            "Este es un ejemplo de recycler view",
            "Este es un ejemplo de recycler view",
            "Este es un ejemplo de recycler view",
            "Este es un ejemplo de recycler view",
            "Este es un ejemplo de recycler view",
            "Este es un ejemplo de recycler view",
            "Este es un ejemplo de recycler view",
            "Este es un ejemplo de recycler view",
            "Este es un ejemplo de recycler view",
            "Este es un ejemplo de recycler view",
            "Este es un ejemplo de recycler view",
            "Este es un ejemplo de recycler view",
            "Este es un ejemplo de recycler view",
            "Este es un ejemplo de recycler view",
        )

        recylcerEjemploAdapter.addDataToList(listaDatos)

        binding.recyclerEjemplo.apply {
            layoutManager =
                LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
            adapter = recylcerEjemploAdapter
        }
    }
}