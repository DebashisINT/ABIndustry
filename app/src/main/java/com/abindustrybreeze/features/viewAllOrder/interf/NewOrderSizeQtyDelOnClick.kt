package com.abindustrybreeze.features.viewAllOrder.interf

import com.abindustrybreeze.app.domain.NewOrderGenderEntity
import com.abindustrybreeze.features.viewAllOrder.model.ProductOrder
import java.text.FieldPosition

interface NewOrderSizeQtyDelOnClick {
    fun sizeQtySelListOnClick(product_size_qty: ArrayList<ProductOrder>)
    fun sizeQtyListOnClick(product_size_qty: ProductOrder,position: Int)
}