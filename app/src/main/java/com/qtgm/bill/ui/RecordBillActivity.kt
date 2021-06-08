package com.qtgm.bill.ui

import android.view.View
import androidx.recyclerview.widget.GridLayoutManager
import com.qtgm.base.base.BaseActivity
import com.qtgm.bill.R
import com.qtgm.bill.adapter.CategoryAdapter
import com.qtgm.bill.model.Category
import com.qtgm.bill.utils.VibrateUtils
import kotlinx.android.synthetic.main.activity_record_bill.*

class RecordBillActivity : BaseActivity() {

    private val totalMoney = StringBuilder("0.00")

    override fun setLayoutId(): Int = R.layout.activity_record_bill

    override fun setStatusBarColor(): Int = getColor(R.color.fd7468)

    override fun initView() {
        ivCloseRecord.setOnClickListener(numberClick)

        tvRecordNumber0.setOnClickListener(numberClick)
        tvRecordNumber1.setOnClickListener(numberClick)
        tvRecordNumber2.setOnClickListener(numberClick)
        tvRecordNumber3.setOnClickListener(numberClick)
        tvRecordNumber4.setOnClickListener(numberClick)
        tvRecordNumber5.setOnClickListener(numberClick)
        tvRecordNumber6.setOnClickListener(numberClick)
        tvRecordNumber7.setOnClickListener(numberClick)
        tvRecordNumber8.setOnClickListener(numberClick)
        tvRecordNumber9.setOnClickListener(numberClick)

        tvRecordDot.setOnClickListener(numberClick)

        tvRecordDiv.setOnClickListener(numberClick)
        tvRecordMul.setOnClickListener(numberClick)
        tvRecordSub.setOnClickListener(numberClick)
        tvRecordAdd.setOnClickListener(numberClick)
        ivBackClick.setOnClickListener(numberClick)

        tvRecordInsert.setOnClickListener(numberClick)


    }


    override fun initData() {
        tvMoney.text = totalMoney.toString()
        rvCategory.layoutManager = GridLayoutManager(mContext, 5)
        rvCategory.adapter = CategoryAdapter(Category.values().toList())


    }

    private val numberClick = View.OnClickListener {
        VibrateUtils.vibrate(mContext, 5)
        when (it.id) {
            R.id.ivCloseRecord -> finish()
            R.id.tvRecordNumber0 -> clickNumber(0.0)
            R.id.tvRecordNumber1 -> clickNumber(1.0)
            R.id.tvRecordNumber2 -> clickNumber(2.0)
            R.id.tvRecordNumber3 -> clickNumber(3.0)
            R.id.tvRecordNumber4 -> clickNumber(4.0)
            R.id.tvRecordNumber5 -> clickNumber(5.0)
            R.id.tvRecordNumber6 -> clickNumber(6.0)
            R.id.tvRecordNumber7 -> clickNumber(7.0)
            R.id.tvRecordNumber8 -> clickNumber(8.0)
            R.id.tvRecordNumber9 -> clickNumber(9.0)
            R.id.ivBackClick -> back()
        }
    }

    private fun clickNumber(number: Double) {
//        totalMoney.clear()
        totalMoney.append(number).append(0)
        updateTotalMoney()
    }

    private fun back() {
        totalMoney.delete(totalMoney.length - 1, totalMoney.length)
        updateTotalMoney()
    }

    private fun updateTotalMoney() {
        tvMoney.text = totalMoney.toString()
    }


}