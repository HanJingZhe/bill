package com.qtgm.bill.model

/**
 * @author peng_wang
 * @date 2021/6/5
 */
data class Bill(
    val money: Double,
    val date: Long,
    val remark: String,
    val category: Category,

    ) {

    data class Category(
        val desc: String,
        val icon: Int,
    )

}
