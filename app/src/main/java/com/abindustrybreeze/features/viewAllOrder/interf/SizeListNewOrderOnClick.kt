package com.abindustrybreeze.features.viewAllOrder.interf

import com.abindustrybreeze.app.domain.NewOrderProductEntity
import com.abindustrybreeze.app.domain.NewOrderSizeEntity

interface SizeListNewOrderOnClick {
    fun sizeListOnClick(size: NewOrderSizeEntity)
}