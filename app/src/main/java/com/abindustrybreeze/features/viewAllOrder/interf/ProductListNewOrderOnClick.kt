package com.abindustrybreeze.features.viewAllOrder.interf

import com.abindustrybreeze.app.domain.NewOrderGenderEntity
import com.abindustrybreeze.app.domain.NewOrderProductEntity

interface ProductListNewOrderOnClick {
    fun productListOnClick(product: NewOrderProductEntity)
}