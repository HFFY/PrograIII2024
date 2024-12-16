package com.example.prograiii2024.room

import android.content.Context
import androidx.core.app.Person
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.prograiii2024.dataclasses.Estudiante

@Database(
    entities = [Estudiante::class],
    version = 1,
    exportSchema = false
)
abstract class EstudianteDataBase: RoomDatabase() {
    abstract fun estudianteDao(): EstudianteDao

    companion object{
        @Volatile
        private var INSTANCE: EstudianteDataBase? = null

        fun getDatabase(context: Context): EstudianteDataBase{
            return INSTANCE ?: synchronized(this){
                val room = Room
                    .databaseBuilder(
                        context,
                        EstudianteDataBase::class.java,
                        "Estudiantes"
                    )
                    .build()
                INSTANCE = room
                room
            }
        }
    }
}