package com.abindustrybreeze.features.location.shopRevisitStatus

import com.abindustrybreeze.base.BaseResponse
import com.abindustrybreeze.features.location.model.ShopDurationRequest
import com.abindustrybreeze.features.location.model.ShopRevisitStatusRequest
import io.reactivex.Observable

class ShopRevisitStatusRepository(val apiService : ShopRevisitStatusApi) {
    fun shopRevisitStatus(shopRevisitStatus: ShopRevisitStatusRequest?): Observable<BaseResponse> {
        return apiService.submShopRevisitStatus(shopRevisitStatus)
    }
}