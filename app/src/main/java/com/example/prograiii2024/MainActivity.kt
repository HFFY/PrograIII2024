package com.example.prograiii2024

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        estaEsnaFuncionDePrueba()
        var ejemplo = funcionDePrueba2()
        ejemplo = "asi deberia funcionar un merge $ejemplo"
    }

    fun estaEsnaFuncionDePrueba(){
        val prueba = "test"
    }

    fun funcionDePrueba2() : String{
        return "para ejemplificar un merge"
    }
}