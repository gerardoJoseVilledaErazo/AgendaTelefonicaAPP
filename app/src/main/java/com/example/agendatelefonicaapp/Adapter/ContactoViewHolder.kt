package com.example.agendatelefonicaapp.Adapter

import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.agendatelefonicaapp.Models.Contacto
import com.example.agendatelefonicaapp.R

class ContactoViewHolder(view: View): RecyclerView.ViewHolder(view)
{
    val id = view.findViewById<TextView>(R.id.txtId)
    val contacto = view.findViewById<TextView>(R.id.txtNombre)
    val numero = view.findViewById<TextView>(R.id.txtNumero)
    val propietario = view.findViewById<TextView>(R.id.txtPropietario)
    val btnModificar = view.findViewById<Button>(R.id.btnModificar)
    val btnEliminar = view.findViewById<Button>(R.id.btnEliminar)

    fun render(contactoModel: Contacto){
        id.text = contactoModel.id.toString()
        contacto.text = contactoModel.nombreContacto
        numero.text = contactoModel.numeroTelefonico
        propietario.text = contactoModel.propietario
    }
}