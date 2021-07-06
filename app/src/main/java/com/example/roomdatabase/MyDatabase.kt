package com.example.roomdatabase

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = arrayOf(MyEmployee::class), version = 1)
abstract class MyDatabase : RoomDatabase() {

    abstract fun empDao() : MyEmployeeDao
}


