package com.example.roomdatabase

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
@Dao
interface MyEmployeeDao {
    @Query("SELECT * FROM employee")
    fun getAll(): List<MyEmployee>
    @Insert
    fun insertAll(employees : ArrayList<MyEmployee>)
}