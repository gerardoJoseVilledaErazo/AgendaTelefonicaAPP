package com.example.agendatelefonicaapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.agendatelefonicaapp.Adapter.ContactoAdapter
import com.example.agendatelefonicaapp.Provider.ContactoProvider

class MostrarListaContactoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mostrar_lista_contacto)

        // Se agrega la flecha para salir de la actividad
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        // Se configura el nombre de la actividad
        title = "Mostrar Lista de Contactos"

        initRecyclerView()
    }

    fun initRecyclerView(){
        val recyclerView = findViewById<RecyclerView>(R.id.rcvContacto)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = ContactoAdapter(ContactoProvider.contactoList)
    }

    // Se configura la flecha para salir de la actividad
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            android.R.id.home -> {
                // Finalizar la actividad
                finish()
            }
        }
        return super.onOptionsItemSelected(item)
    }
}