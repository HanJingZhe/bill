package com.qtgm.bill.ui

import android.content.Intent
import androidx.recyclerview.widget.LinearLayoutManager
import com.qtgm.base.base.BaseActivity
import com.qtgm.bill.R
import com.qtgm.bill.adapter.BillAdapter
import com.qtgm.bill.model.Bill
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    override fun setLayoutId(): Int = R.layout.activity_main

    override fun setStatusBarColor(): Int = getColor(R.color.primary)

    override fun setNavigationBarColor(): Int = getColor(R.color.primary)

    override fun initView() {
    }

    override fun initData() {

        tvDate.text = "06.05"
        tvTotalMoney.text = getString(R.string.total_money, "2000.0")

        val billAdapter = BillAdapter(fakeData())
        rvBill.layoutManager = LinearLayoutManager(mContext)
        rvBill.adapter = billAdapter


        startActivity(Intent(mContext, RecordBillActivity::class.java))

    }


    fun fakeData(): List<Bill> {
        val category = Bill.Category("餐饮", R.mipmap.ic_launcher)
        val bill = Bill(25.0, System.currentTimeMillis(), "", category)

        val list = mutableListOf(bill)
        repeat(5) {
            list.add(bill)
        }
        return list
    }

}