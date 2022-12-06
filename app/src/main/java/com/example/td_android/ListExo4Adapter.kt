package com.example.td_android

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.td_android.databinding.ActivityItemBinding
import com.example.td_android.databinding.ItemBinding

class ListExo4Adapter() : RecyclerView.Adapter<ListExo4Adapter.ItemViewHolder>() {
    var data: List<Int> = listOf()
        set(value) {
            field = value
            this.notifyDataSetChanged()
        }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.activity_item, parent, false)
        return ItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = data.get(position)
        holder.bind(item)
    }

    class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val binding: ActivityItemBinding = ActivityItemBinding.bind(itemView)

        fun bind(item: Int) {
            binding.textItem.text = item.toString()
        }
    }
}
