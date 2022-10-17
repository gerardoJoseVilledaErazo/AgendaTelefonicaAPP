package com.example.agendatelefonicaapp.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.agendatelefonicaapp.Models.Contacto
import com.example.agendatelefonicaapp.R

class ContactoAdapter(private val contactoList: MutableList<Contacto>
                        ) : RecyclerView.Adapter<ContactoViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactoViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ContactoViewHolder(layoutInflater.inflate(R.layout.item_contacto, parent, false))
    }

    override fun onBindViewHolder(holder: ContactoViewHolder, position: Int) {
        val item = contactoList[position]
        holder.render(item)
    }

    override fun getItemCount(): Int = contactoList.size
}