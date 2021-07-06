package com.example.roomdatabase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.room.Room
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val employees = ArrayList<MyEmployee>()
        val emp=ArrayList<MyEmployee>()
        employees.add(MyEmployee(1, "Name:Naimish", "Designation:Intern"))
        employees.add(MyEmployee(2, "Name:Harsh", "Designation:Intern"))
        employees.add(MyEmployee(3, "Name:Sumit", "Designation:Intern"))
        employees.add(MyEmployee(4, "Name:Puneet", "Designation:Intern"))

        val adapter=MyCustomAdapter(emp)
        recyclerView.adapter=adapter
        val db = Room.databaseBuilder(
            applicationContext,
            MyDatabase::class.java, "EmploueesDB"
        ).allowMainThreadQueries().build()
      var employeeDao  = db.empDao()
        employeeDao.insertAll(employees)
        adapter.notifyDataSetChanged()
        Log.e("TAG", "onCreate: "+employeeDao.getAll() )

    }


}