package com.abindustrybreeze.features.login.model.productlistmodel

import com.abindustrybreeze.app.domain.ModelEntity
import com.abindustrybreeze.app.domain.ProductListEntity
import com.abindustrybreeze.base.BaseResponse

class ModelListResponse: BaseResponse() {
    var model_list: ArrayList<ModelEntity>? = null
}