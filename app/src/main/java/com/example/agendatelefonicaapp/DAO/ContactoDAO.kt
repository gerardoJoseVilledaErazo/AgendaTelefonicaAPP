package com.example.agendatelefonicaapp.DAO

import androidx.room.*
import com.example.agendatelefonicaapp.Models.Contacto

@Dao
interface ContactoDAO
{
    @Query("select * from contactos")
    fun getAll() : MutableList<Contacto>

    @Query("select * from contactos where id = :id")
    fun get(id : Int) : Contacto

    @Insert
    fun save(entity: Contacto)

    @Delete
    fun delete(entity: Contacto)

    @Update
    fun update(entity: Contacto)

    @Query("SELECT*FROM contactos")
    fun getAllStudent(): MutableList<Contacto>
}