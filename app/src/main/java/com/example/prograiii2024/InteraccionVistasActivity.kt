package com.example.prograiii2024

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class InteraccionVistasActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_interaccion_vistas)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val textViewGuardado: TextView = findViewById(R.id.text_view_guardado)
        val buttonGuardar: Button = findViewById(R.id.button_guardar)
        val buttonCambiarActivity: Button = findViewById(R.id.button_cambiar_activity)
        val editTextGuardar: EditText = findViewById(R.id.edit_text_guardar)

        buttonGuardar.setOnClickListener {
            val textoGuardado = editTextGuardar.text.toString()
            textViewGuardado.text = textoGuardado
            editTextGuardar.setText("")
        }

        buttonCambiarActivity.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}