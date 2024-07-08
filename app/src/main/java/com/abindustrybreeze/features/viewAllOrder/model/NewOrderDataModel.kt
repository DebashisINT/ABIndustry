package com.abindustrybreeze.features.viewAllOrder.model

import com.abindustrybreeze.app.domain.NewOrderColorEntity
import com.abindustrybreeze.app.domain.NewOrderGenderEntity
import com.abindustrybreeze.app.domain.NewOrderProductEntity
import com.abindustrybreeze.app.domain.NewOrderSizeEntity
import com.abindustrybreeze.features.stockCompetetorStock.model.CompetetorStockGetDataDtls

class NewOrderDataModel {
    var status:String ? = null
    var message:String ? = null
    var Gender_list :ArrayList<NewOrderGenderEntity>? = null
    var Product_list :ArrayList<NewOrderProductEntity>? = null
    var Color_list :ArrayList<NewOrderColorEntity>? = null
    var size_list :ArrayList<NewOrderSizeEntity>? = null
}

