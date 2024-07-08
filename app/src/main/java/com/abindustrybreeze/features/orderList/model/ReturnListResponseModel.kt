package com.abindustrybreeze.features.orderList.model

import com.abindustrybreeze.base.BaseResponse


class ReturnListResponseModel: BaseResponse() {
    var return_list: ArrayList<ReturnDataModel>? = null
}