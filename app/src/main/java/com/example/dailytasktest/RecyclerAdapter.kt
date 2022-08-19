package com.example.dailytasktest

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import androidx.recyclerview.widget.RecyclerView
import com.example.dailytasktest.ui.home.CustomAdapter

class RecyclerAdapter(private val dataSet: Array<String>) :
    RecyclerView.Adapter<CustomAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomAdapter.ViewHolder {
        // Create a new view, which defines the UI of the list item
        TODO()
    }

    override fun onBindViewHolder(holder: CustomAdapter.ViewHolder, position: Int) {
        TODO()
    }

    override fun getItemCount(): Int {
        TODO()
    }

}