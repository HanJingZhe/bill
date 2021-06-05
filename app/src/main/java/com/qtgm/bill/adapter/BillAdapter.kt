package com.qtgm.bill.adapter

import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.qtgm.bill.R
import com.qtgm.bill.model.Bill

/**
 * @author peng_wang
 * @date 2021/6/5
 */
class BillAdapter(
    private val billList: List<Bill>
) : RecyclerView.Adapter<BillAdapter.ViewHolder>() {

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tvPlaceName: TextView = view.findViewById(R.id.ivHistory)
        val tvPlaceAddress: TextView = view.findViewById(R.id.ivHistory)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }


}