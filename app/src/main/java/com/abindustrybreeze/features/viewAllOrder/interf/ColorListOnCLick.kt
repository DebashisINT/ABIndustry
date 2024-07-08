package com.abindustrybreeze.features.viewAllOrder.interf

import com.abindustrybreeze.app.domain.NewOrderGenderEntity
import com.abindustrybreeze.features.viewAllOrder.model.ProductOrder

interface ColorListOnCLick {
    fun colorListOnCLick(size_qty_list: ArrayList<ProductOrder>, adpPosition:Int)
}