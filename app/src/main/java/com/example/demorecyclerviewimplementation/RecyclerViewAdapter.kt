package com.example.demorecyclerviewimplementation

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.demorecyclerviewimplementation.databinding.RecyclerViewItemViewBinding

class RecyclerViewAdapter: ListAdapter<ListDataDemo,RecyclerViewAdapter.RecyclerViewHolder>(RecyclerViewDiffCallback()) {


    class RecyclerViewHolder private constructor(val binding: RecyclerViewItemViewBinding): RecyclerView.ViewHolder(binding.root){

        companion object {
            fun from(parent: ViewGroup): RecyclerViewHolder {
                val layoutInflater = LayoutInflater.from(parent.context)
                val binding = RecyclerViewItemViewBinding.inflate(layoutInflater,parent,false)
                return RecyclerViewHolder(binding)
            }
        }

        fun bind(
            item: ListDataDemo
        ) {
            binding.data = item
            binding.executePendingBindings()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder {
        return RecyclerViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) {
        val item = getItem(position)
        holder.bind(item)
    }
}

class RecyclerViewDiffCallback: DiffUtil.ItemCallback<ListDataDemo>(){
    override fun areItemsTheSame(oldItem: ListDataDemo, newItem: ListDataDemo): Boolean {
        return oldItem.text == newItem.text
    }

    override fun areContentsTheSame(oldItem: ListDataDemo, newItem: ListDataDemo): Boolean {
        return oldItem == newItem
    }

}