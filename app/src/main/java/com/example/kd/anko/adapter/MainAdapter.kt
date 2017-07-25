package com.example.kd.anko.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.kd.anko.R
import kotlinx.android.synthetic.main.layout_common_item.view.*

/**
 * Created by Knight_Davion on 2017/7/25.
 */
class MainAdapter(val list: List<String> = listOf<String>("Dialogs", "Intents", "Logging", "Misc", "SQLite"),
                  val itemClick: (Int) -> Unit) : RecyclerView.Adapter<MainAdapter.ViewHolder>() {

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindView(list[position])
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.layout_common_item, parent, false)
        return ViewHolder(view, itemClick)
    }

    override fun getItemCount() = list.size

    class ViewHolder(view: View, val itemClick: (Int) -> Unit) : RecyclerView.ViewHolder(view) {
        fun bindView(s: String) {
            itemView.name.text = s
            itemView.setOnClickListener { itemClick(position) }
        }
    }
}