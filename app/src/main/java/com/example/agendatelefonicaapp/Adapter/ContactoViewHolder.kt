package com.example.agendatelefonicaapp.Adapter

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.agendatelefonicaapp.Models.Contacto
import com.example.agendatelefonicaapp.R

class ContactoViewHolder(view: View): RecyclerView.ViewHolder(view)
{
    val contacto = view.findViewById<TextView>(R.id.txtNombre)
    val numero = view.findViewById<TextView>(R.id.txtNumero)
    val propietario = view.findViewById<TextView>(R.id.txtPropietario)
    fun render(contactoModel: Contacto){
        contacto.text = contactoModel.nombreContacto
        numero.text = contactoModel.numeroTelefonico
        propietario.text = contactoModel.propietario
    }
}