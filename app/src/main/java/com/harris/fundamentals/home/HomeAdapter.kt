package com.harris.fundamentals.home

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.harris.fundamentals.R
import com.harris.fundamentals.databinding.HomeRecyclerItemBinding

class HomeAdapter(private val items: List<MenuItem>) :
    RecyclerView.Adapter<HomeAdapter.ViewHolder>() {

    private var listener:OnItemClickListener? = null

    interface OnItemClickListener {
        fun onItemClick(position:Int)
    }
    inner class ViewHolder(private val context: Context, private val binding: HomeRecyclerItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: MenuItem, position:Int) {
//            TODO("Enable to change DataBiding")
            binding.homeCourse.text = item.course
            binding.homeTitle.text = item.title
            binding.homeDesc.text = item.desc
            binding.homeDate.text = item.date
            binding.root.setBackgroundColor(item.color)

            binding.root.setOnClickListener {
                listener?.onItemClick(position)
            }
        }
    }

    fun setOnItemClickListener(listener:OnItemClickListener){
        this.listener = listener
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeAdapter.ViewHolder {
        val binding =
            HomeRecyclerItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(parent.context, binding)
    }

    override fun onBindViewHolder(holder: HomeAdapter.ViewHolder, position: Int) {

        holder.bind(items[position],position)
    }

    override fun getItemCount(): Int {
        return items.size
    }

}