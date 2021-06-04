package com.qtgm.bill

import com.qtgm.base.base.BaseActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    override fun setLayoutId(): Int = R.layout.activity_main

    override fun initView() {
        tvShow.text = "hello bill!"
    }

    override fun initData() {
    }


}