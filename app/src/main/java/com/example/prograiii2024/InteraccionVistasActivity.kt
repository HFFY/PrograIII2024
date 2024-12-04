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
import com.example.prograiii2024.databinding.ActivityInteraccionVistasBinding
import com.example.prograiii2024.MainActivity.Companion.ID_PASO_NOMBRE

class InteraccionVistasActivity : AppCompatActivity() {

    private lateinit var binding: ActivityInteraccionVistasBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityInteraccionVistasBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.buttonGuardar.setOnClickListener {
            val textoGuardado = binding.editTextGuardar.text.toString()
            binding.textViewGuardado.text = textoGuardado
            binding.editTextGuardar.setText("")
        }

        binding.buttonCambiarActivity.setOnClickListener {
            val intentMainActivity = Intent(this, MainActivity::class.java)
            intentMainActivity.putExtra(ID_PASO_NOMBRE,"Hugo")
            startActivity(intentMainActivity)
        }

        binding.buttonCambiarActivityScroll.setOnClickListener {
            val intentScroll = Intent(this, EjemploScrollActivity::class.java)
            startActivity(intentScroll)
        }

        binding.textViewGuardado.text
    }
}