package com.abindustrybreeze.features.stockCompetetorStock.api

import com.abindustrybreeze.base.BaseResponse
import com.abindustrybreeze.features.orderList.model.NewOrderListResponseModel
import com.abindustrybreeze.features.stockCompetetorStock.ShopAddCompetetorStockRequest
import com.abindustrybreeze.features.stockCompetetorStock.model.CompetetorStockGetData
import io.reactivex.Observable

class AddCompStockRepository(val apiService:AddCompStockApi){

    fun addCompStock(shopAddCompetetorStockRequest: ShopAddCompetetorStockRequest): Observable<BaseResponse> {
        return apiService.submShopCompStock(shopAddCompetetorStockRequest)
    }

    fun getCompStockList(sessiontoken: String, user_id: String, date: String): Observable<CompetetorStockGetData> {
        return apiService.getCompStockList(sessiontoken, user_id, date)
    }
}