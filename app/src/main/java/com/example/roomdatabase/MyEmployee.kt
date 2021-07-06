package com.example.roomdatabase

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName =  "employee")
data class MyEmployee(

    @PrimaryKey
    @NonNull
    val uid: Int,
    @ColumnInfo(name = "name") var name:String?,
    @ColumnInfo(name= "designation") var designation:String?

)