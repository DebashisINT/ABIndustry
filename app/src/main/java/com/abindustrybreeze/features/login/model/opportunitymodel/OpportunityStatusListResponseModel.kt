package com.abindustrybreeze.features.login.model.opportunitymodel

import com.abindustrybreeze.app.domain.OpportunityStatusEntity
import com.abindustrybreeze.app.domain.ProductListEntity
import com.abindustrybreeze.base.BaseResponse

/**
 * Created by Puja on 30.05.2024
 */
class OpportunityStatusListResponseModel : BaseResponse() {
    var status_list: ArrayList<OpportunityStatusEntity>? = null
}