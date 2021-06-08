package com.qtgm.bill.customView

import android.content.Context
import android.view.MotionEvent
import androidx.recyclerview.widget.RecyclerView
import com.qtgm.base.utils.MyLog

/**
 * @author peng_wang
 * @date 2021/6/7
 */
class MyRecyclerView(context: Context) : RecyclerView(context) {

    val TAG = this.javaClass.simpleName

    override fun onTouchEvent(e: MotionEvent?): Boolean {
        e?.let {
            when (it.action) {
                MotionEvent.ACTION_DOWN -> MyLog.d(TAG, "DOWN")
                MotionEvent.ACTION_MOVE -> MyLog.d(TAG, "DOWN")
                MotionEvent.ACTION_UP -> MyLog.d(TAG, "DOWN")
            }
        }
            return true

    }

}