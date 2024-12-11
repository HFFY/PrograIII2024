package com.example.prograiii2024

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.prograiii2024.dataclasses.Producto

class MainActivity : AppCompatActivity() {

    companion object{
        val ID_PASO_NOMBRE = "NOMBRE"
        val CLAVE_BOOLEAN = "IdentificadorBoolean"
        val CLAVE_STR = "IdentificadorString"
        val CLAVE_INT = "IndentificadorInt"
        val CLAVE_YA_GUARDO_DATOS = "IdentificadorGuardoDatos"
        val CLAVE_QUESO = "Queso"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val textViewNombre: TextView = findViewById(R.id.text_view_mostrar_nombre)
        val nombre = intent.getStringExtra(ID_PASO_NOMBRE)
        val validador = intent.hasExtra(CLAVE_QUESO)
        if (validador) {
            val queso = intent.getSerializableExtra(CLAVE_QUESO) as Producto
            textViewNombre.text = queso.nombre
        }

    }
}