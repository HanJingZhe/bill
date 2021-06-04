package com.qtgm.bill

import android.app.Application
import com.qtgm.base.base.BaseLib

/**
 * @author peng_wang
 * @date 2021/6/5
 */
class BillApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        BaseLib.init(applicationContext)
    }

}