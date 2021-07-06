package com.example.roomdatabase

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class MyCustomAdapter(val employeeList: ArrayList<MyEmployee>) : RecyclerView.Adapter<MyCustomAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyCustomAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.list_layout,parent,false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: MyCustomAdapter.ViewHolder, position: Int) {
        holder.bindItems(employeeList[position])
    }
    override fun getItemCount(): Int {
        return employeeList.size
    }

    class ViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView){

        fun bindItems(employee: MyEmployee){
            val textViewId = itemView.findViewById(R.id.empid_textView) as TextView
            val textViewName = itemView.findViewById(R.id.empname_textView) as TextView
            val textViewDesignation = itemView.findViewById(R.id.empdesignation_textView) as TextView
            textViewId.text = employee.uid.toString()
            textViewName.text = employee.name
            textViewDesignation.text = employee.designation
        }

    }
}