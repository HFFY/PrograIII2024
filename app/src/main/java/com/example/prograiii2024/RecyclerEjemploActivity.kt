package com.example.prograiii2024

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.prograiii2024.MainActivity.Companion.CLAVE_BOOLEAN
import com.example.prograiii2024.MainActivity.Companion.CLAVE_INT
import com.example.prograiii2024.MainActivity.Companion.CLAVE_QUESO
import com.example.prograiii2024.MainActivity.Companion.CLAVE_STR
import com.example.prograiii2024.MainActivity.Companion.CLAVE_YA_GUARDO_DATOS
import com.example.prograiii2024.adapters.RecyclerEjemploAdapter.RecyclerEjemploAdapter
import com.example.prograiii2024.databinding.ActivityRecyclerEjemploBinding
import com.example.prograiii2024.dataclasses.Producto
import com.google.gson.Gson

class RecyclerEjemploActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRecyclerEjemploBinding

    private val recylcerEjemploAdapter by lazy { RecyclerEjemploAdapter() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRecyclerEjemploBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        setUpRecyclerView()
        guardarDatos()
    }

    fun setUpRecyclerView() {
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
        val gson = Gson()
        val queso = gson.fromJson(
            "{\"nombre\":\"queso\",\"fechaDeVencimiento\":\"12/01/25\",\"cantidad\":1}",
            Producto::class.java
        )
        listaDatos.add(queso)
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

        binding.buttonEjemploEstatico.setOnClickListener {
            val intentPasoSerializable = Intent(this, MainActivity::class.java)
            intentPasoSerializable.putExtra(CLAVE_QUESO, queso)
            startActivity(intentPasoSerializable)
        }
    }

    fun guardarDatos() {
        val context = this
        val sharedPref = context.getPreferences(Context.MODE_PRIVATE) ?: return
        val flagDatosGuardados = sharedPref.getBoolean(CLAVE_YA_GUARDO_DATOS, false)
        if (!flagDatosGuardados) {
            with(sharedPref.edit()) {
                putInt(CLAVE_INT, 0)
                putString(CLAVE_STR, "Hola Mundo")
                putBoolean(CLAVE_BOOLEAN, false)
                putBoolean(CLAVE_YA_GUARDO_DATOS, true)
                apply()
            }
            binding.textViewFinal.text = "Se Guardaron los datos"
        } else {
            binding.textViewFinal.text = "No se Guardaron los Datos porque ya estaban en el archivo shared"
        }
    }
}