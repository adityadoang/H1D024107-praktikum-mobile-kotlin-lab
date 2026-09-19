package com.example.aditaja.data.dummy

import com.example.aditaja.R
import com.example.aditaja.data.model.Category
import com.example.aditaja.data.model.Product

object DummyData {
    val categories = listOf(
        Category(id = 1, name = "Makanan", description = "Aneka Makanan Lokal", products_count = 5),
        Category(id = 2, name = "Minuman", description = "Minuman Segar", products_count = 5),
        Category(id = 3, name = "Kerajinan", description = "Kerajinan Tangan", products_count = 5)
    )

    val products = listOf(
        Product(id = 1, categoryId = 1, category = categories[0], name = "Kripik Singkong", description = "Kripik renyah", price = 15000.0, stock = 20, img = R.drawable.ps),
        Product(id = 2, categoryId = 1, category = categories[0], name = "Mendoan", description = "Tempe mendoan tradisional", price = 20000.0, stock = 15, img = R.drawable.ps),
        Product(id = 3, categoryId = 1, category = categories[0], name = "Sale Pisang", description = "Manisan pisang khas", price = 25000.0, stock = 10, img = R.drawable.ps),
        Product(id = 4, categoryId = 1, category = categories[0], name = "Getuk Goreng", description = "Getuk manis legit", price = 30000.0, stock = 40, img = R.drawable.ps),
        Product(id = 5, categoryId = 1, category = categories[0], name = "Nopia", description = "Kue nopia manis", price = 18000.0, stock = 25, img = R.drawable.ps),

        Product(id = 6, categoryId = 2, category = categories[1], name = "Teh Poci", description = "Teh hangat wangi", price = 5000.0, stock = 50, img = R.drawable.ps),
        Product(id = 7, categoryId = 2, category = categories[1], name = "Es Dawet", description = "Es dawet segar", price = 8000.0, stock = 30, img = R.drawable.ps),
        Product(id = 8, categoryId = 2, category = categories[1], name = "Wedang Jahe", description = "Minuman jahe hangat", price = 7000.0, stock = 25, img = R.drawable.ps),
        Product(id = 9, categoryId = 2, category = categories[1], name = "Es Teh", description = "Es teh manis", price = 4000.0, stock = 60, img = R.drawable.ps),
        Product(id = 10, categoryId = 2, category = categories[1], name = "Jus Alpukat", description = "Jus alpukat kental", price = 12000.0, stock = 20, img = R.drawable.ps),

        Product(id = 11, categoryId = 3, category = categories[2], name = "Sapu Glagah", description = "Sapu lantai dari glagah", price = 15000.0, stock = 10, img = R.drawable.ps),
        Product(id = 12, categoryId = 3, category = categories[2], name = "Tas Rajut", description = "Tas buatan tangan", price = 75000.0, stock = 5, img = R.drawable.ps),
        Product(id = 13, categoryId = 3, category = categories[2], name = "Bambu Craft", description = "Hiasan dari bambu", price = 50000.0, stock = 8, img = R.drawable.ps),
        Product(id = 14, categoryId = 3, category = categories[2], name = "Anyaman Bambu", description = "Keranjang serbaguna", price = 35000.0, stock = 12, img = R.drawable.ps),
        Product(id = 15, categoryId = 3, category = categories[2], name = "Topi Caping", description = "Topi petani tradisional", price = 20000.0, stock = 15, img = R.drawable.ps)
    )
}