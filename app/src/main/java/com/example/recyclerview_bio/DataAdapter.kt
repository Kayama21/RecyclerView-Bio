package com.example.recyclerview_bio

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.livedatarecyclerview.DataModel

class DataAdapter(private var data: MutableList<DataModel>) : RecyclerView.Adapter<DataAdapter.DataViewHolder>() {

    class DataViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.items, parent, false)
        return DataViewHolder(view)
    }

    override fun onBindViewHolder(holder: DataViewHolder, position: Int) {
        holder.itemView.apply {
            findViewById<ImageView>(R.id.photo).setImageResource(data[position].photo)
            findViewById<TextView>(R.id.tv_nama).text = data[position].nama
            findViewById<TextView>(R.id.tv_nim).text = "${data[position].nim} - Kelas ${data[position].kelas}"
        }
    }

    override fun getItemCount(): Int {
        return data.size
    }
}