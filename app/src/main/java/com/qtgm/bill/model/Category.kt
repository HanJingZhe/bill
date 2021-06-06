package com.qtgm.bill.model

import com.qtgm.bill.R

/**
 * @author peng_wang
 * @date 2021/6/6
 */
enum class Category(val dark: Int, val light: Int, val desc: String, var select: Boolean) {

    RESTAURANT(R.mipmap.ic_category_restaurant_dark, R.mipmap.ic_category_restaurant_light, "餐饮",  true),
    SHOP(R.mipmap.ic_category_shop_dark, R.mipmap.ic_category_shop_light, "购物", false),
    CAR(R.mipmap.ic_category_car_dark, R.mipmap.ic_category_car_light, "交通", false),
    HOUSE(R.mipmap.ic_category_house_dark, R.mipmap.ic_category_house_light, "居住", false),
    BOOK(R.mipmap.ic_category_book_dark, R.mipmap.ic_category_book_light, "书籍", false),
    NORMAL(R.mipmap.ic_category_normal_dark, R.mipmap.ic_category_normal_light, "一般", false),
    GAME(R.mipmap.ic_category_game_dark, R.mipmap.ic_category_game_light, "游戏", false),
    PHONE(R.mipmap.ic_category_phone_dark, R.mipmap.ic_category_phone_light, "手机", false),
    TOGETHER(R.mipmap.ic_category_together_dark, R.mipmap.ic_category_together_light, "聚会", false),
    SMOKE(R.mipmap.ic_category_smoke_dark, R.mipmap.ic_category_smoke_light, "香烟", false),

}