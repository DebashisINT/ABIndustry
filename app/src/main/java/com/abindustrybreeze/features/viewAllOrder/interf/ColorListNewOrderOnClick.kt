package com.abindustrybreeze.features.viewAllOrder.interf

import com.abindustrybreeze.app.domain.NewOrderColorEntity
import com.abindustrybreeze.app.domain.NewOrderProductEntity

interface ColorListNewOrderOnClick {
    fun productListOnClick(color: NewOrderColorEntity)
}