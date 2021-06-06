package com.qtgm.bill.utils

import android.app.Service
import android.content.Context
import android.os.VibrationEffect
import android.os.Vibrator

/**
 * @author peng_wang
 * @date 2021/6/6
 * @desc 调用设备震动
 */
object VibrateUtils {

    fun vibrate(c: Context, ms: Long) {
        val appCtx = c.applicationContext
        val vibrator = appCtx.getSystemService(Service.VIBRATOR_SERVICE) as Vibrator
        if (vibrator.hasVibrator()) {
            vibrator.vibrate(VibrationEffect.createOneShot(ms, VibrationEffect.DEFAULT_AMPLITUDE))
        }
    }

}