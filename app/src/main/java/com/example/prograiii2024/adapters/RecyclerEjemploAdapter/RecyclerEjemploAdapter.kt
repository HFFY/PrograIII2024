package com.example.prograiii2024.adapters.RecyclerEjemploAdapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.prograiii2024.databinding.ItemEjemploVistaBinding

class RecyclerEjemploAdapter :
    RecyclerView.Adapter<RecyclerEjemploAdapter.EjemploViewHolder>() {

    private val listaDatos = mutableListOf<String>()
    private var context: Context? = null

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): EjemploViewHolder {
        context = parent.context
        return EjemploViewHolder(
            ItemEjemploVistaBinding.inflate(
                LayoutInflater.from(context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: EjemploViewHolder, position: Int) {
        holder.binding(listaDatos[position])
    }

    override fun getItemCount(): Int = listaDatos.size

    inner class EjemploViewHolder(private val binding: ItemEjemploVistaBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun binding(data: String) {
            binding.textViewEjemplo.text = data
        }
    }

    fun addDataToList(list: List<String>) {
        listaDatos.clear()
        listaDatos.addAll(list)
    }

}