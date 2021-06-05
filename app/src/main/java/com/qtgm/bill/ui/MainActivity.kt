package com.qtgm.bill.ui

import com.qtgm.base.base.BaseActivity
import com.qtgm.bill.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    override fun setLayoutId(): Int = R.layout.activity_main

    override fun setStatusBarColor(): Int = getColor(R.color.primary)

    override fun setNavigationBarColor(): Int = getColor(R.color.primary)

    override fun initView() {
    }

    override fun initData() {

        tvDate.text = "06.05"

        tvTotalMoney.text = "$ 2000.00"


    }


}