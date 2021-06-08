package com.qtgm.bill.ui

import android.view.GestureDetector
import android.view.MotionEvent
import androidx.recyclerview.widget.LinearLayoutManager
import com.qtgm.base.base.BaseActivity
import com.qtgm.base.utils.MyLog
import com.qtgm.base.utils.ToastUtils
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


        //startActivity(Intent(mContext, RecordBillActivity::class.java))


        myGestureDetector = MyGestureDetector()
        gestureDetector = GestureDetector(this, myGestureDetector)
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


    companion object {
        //定义滑动的最小距离
        private val MIN_DISTANCE = 100;
    }

    private lateinit var myGestureDetector: MyGestureDetector
    private lateinit var gestureDetector: GestureDetector

    override fun onTouchEvent(event: MotionEvent?): Boolean {
        MyLog.d(TAG, event?.action.toString())
        return true
    }

    /*override fun onTouchEvent(event: MotionEvent?): Boolean {
        return gestureDetector.onTouchEvent(event)
    }*/

    /**
     * 自定义MyGestureDetector类继承SimpleOnGestureListener
     */
    class MyGestureDetector : GestureDetector.SimpleOnGestureListener() {
        val TAG = this.javaClass.simpleName
        override fun onFling(
            e1: MotionEvent?,
            e2: MotionEvent?,
            velocityX: Float,
            velocityY: Float
        ): Boolean {
            if (e1!!.getX() - e2!!.getX() > MIN_DISTANCE) {
                ToastUtils.toastS("左滑")
                MyLog.d(TAG, "左滑")
            } else if (e2.getX() - e1.getX() > MIN_DISTANCE) {
                ToastUtils.toastS("右滑")
                MyLog.d(TAG, "右滑")
            } else if (e1.getY() - e2.getY() > MIN_DISTANCE) {
                ToastUtils.toastS("上滑")
                MyLog.d(TAG, "上滑")
            } else if (e2.getY() - e1.getY() > MIN_DISTANCE) {
                ToastUtils.toastS("下滑")
                MyLog.d(TAG, "下滑")
            }
            return true
        }


    }


}