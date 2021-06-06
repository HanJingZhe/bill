package com.qtgm.bill.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.qtgm.bill.R
import com.qtgm.bill.model.Bill
import java.text.SimpleDateFormat
import java.util.*

/**
 * @author peng_wang
 * @date 2021/6/5
 */
class BillAdapter(
    private val billList: List<Bill>
) : RecyclerView.Adapter<BillAdapter.ViewHolder>() {

    val sdf = SimpleDateFormat("HH:mm", Locale.getDefault())

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val ivCategory: ImageView = view.findViewById(R.id.ivCategory)
        val tvCategory: TextView = view.findViewById(R.id.tvCategory)
        val tvTime: TextView = view.findViewById(R.id.tvTime)
        val tvMoney: TextView = view.findViewById(R.id.tvMoney)
        val viewBottom: View = view.findViewById(R.id.viewBottom)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.adapter_bill_layout, parent, false)
        val holder = ViewHolder(itemView)
        return holder
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.ivCategory.setImageResource(billList.get(position).category.icon)
        holder.tvCategory.text = billList[position].category.desc
        holder.tvTime.text = sdf.format(Date(billList[position].date))
        holder.tvMoney.text = billList[position].money.toString()
        if (position == billList.size - 1) holder.viewBottom.visibility = View.GONE
    }

    override fun getItemCount(): Int = billList.size


}