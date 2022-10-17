package com.example.agendatelefonicaapp.DataBase

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.agendatelefonicaapp.DAO.ContactoDAO
import com.example.agendatelefonicaapp.Models.Contacto

@Database(entities = [Contacto::class], version = 1)
abstract class contactoDataBase : RoomDatabase()
{
    abstract fun contactoDao(): ContactoDAO
    companion object {
        private var instance: contactoDataBase? = null

        fun getContactDatabase(context: Context): contactoDataBase?
        {
            if (instance == null) {
                instance = Room.databaseBuilder(
                    context,
                    contactoDataBase::class.java,
                    "contacto.db"
                ).allowMainThreadQueries()
                    .build()
            }
            return instance
        }
    }
}