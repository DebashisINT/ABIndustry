package com.abindustrybreeze.features.viewAllOrder.orderOptimized

import com.abindustrybreeze.app.domain.ProductOnlineRateTempEntity
import com.abindustrybreeze.base.BaseResponse
import com.abindustrybreeze.features.login.model.productlistmodel.ProductRateDataModel
import java.io.Serializable

class ProductRateOnlineListResponseModel: BaseResponse(), Serializable {
    var product_rate_list: ArrayList<ProductOnlineRateTempEntity>? = null
}