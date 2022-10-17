package com.example.agendatelefonicaapp.Provider

import com.example.agendatelefonicaapp.Models.Contacto

class ContactoProvider {
    companion object {
        val contactoList = mutableListOf<Contacto>(
            Contacto(
                nombreContacto = "Jose",
                numeroTelefonico = "7777-7777",
                propietario = "Pedro"
            ),
            Contacto(
                nombreContacto = "Jose2",
                numeroTelefonico = "7777-7777",
                propietario = "Pedro"
            ),
            Contacto(
                nombreContacto = "Jose3",
                numeroTelefonico = "7777-7777",
                propietario = "Pedro"
            )
        )
    }
}