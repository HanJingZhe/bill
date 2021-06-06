package com.qtgm.bill.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.qtgm.bill.R
import com.qtgm.bill.model.Category

/**
 * @author peng_wang
 * @date 2021/6/6
 */
class CategoryAdapter(
    private val categoryList: List<Category>
) : RecyclerView.Adapter<CategoryAdapter.ViewHolder>() {

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val ivCategory: ImageView = view.findViewById(R.id.ivCategory)
        val tvCategory: TextView = view.findViewById(R.id.tvCategory)
    }

    private var selectPos: Int = 0

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView =
            LayoutInflater.from(parent.context)
                .inflate(R.layout.adapter_category_layout, parent, false)
        val holder = ViewHolder(itemView)

        holder.itemView.setOnClickListener {
            holder.itemView.background = null
        }
        return holder
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.tvCategory.text = categoryList[position].desc
        if (categoryList[position].select) {
            holder.itemView.setBackgroundResource(R.drawable.radius8_solid_fd7468)
            holder.ivCategory.setImageResource(categoryList[position].light)
            holder.tvCategory.setTextColor(holder.itemView.context.getColor(R.color.white))
        } else {
            holder.itemView.background = null
            holder.ivCategory.setImageResource(categoryList[position].dark)
            holder.tvCategory.setTextColor(holder.itemView.context.getColor(R.color.black))
        }

        holder.itemView.setOnClickListener {
            categoryList[selectPos].select = false
            categoryList[position].select = true
            notifyItemChanged(position)
            notifyItemChanged(selectPos)
            selectPos = position
        }

    }

    override fun getItemCount(): Int = categoryList.size


}