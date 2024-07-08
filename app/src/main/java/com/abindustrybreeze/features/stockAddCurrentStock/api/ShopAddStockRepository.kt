package com.abindustrybreeze.features.stockAddCurrentStock.api

import com.abindustrybreeze.base.BaseResponse
import com.abindustrybreeze.features.location.model.ShopRevisitStatusRequest
import com.abindustrybreeze.features.location.shopRevisitStatus.ShopRevisitStatusApi
import com.abindustrybreeze.features.stockAddCurrentStock.ShopAddCurrentStockRequest
import com.abindustrybreeze.features.stockAddCurrentStock.model.CurrentStockGetData
import com.abindustrybreeze.features.stockCompetetorStock.model.CompetetorStockGetData
import io.reactivex.Observable

class ShopAddStockRepository (val apiService : ShopAddStockApi){
    fun shopAddStock(shopAddCurrentStockRequest: ShopAddCurrentStockRequest?): Observable<BaseResponse> {
        return apiService.submShopAddStock(shopAddCurrentStockRequest)
    }

    fun getCurrStockList(sessiontoken: String, user_id: String, date: String): Observable<CurrentStockGetData> {
        return apiService.getCurrStockListApi(sessiontoken, user_id, date)
    }

}