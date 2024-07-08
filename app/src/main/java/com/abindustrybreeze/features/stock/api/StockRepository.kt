package com.abindustrybreeze.features.stock.api

import com.abindustrybreeze.app.Pref
import com.abindustrybreeze.base.BaseResponse
import com.abindustrybreeze.features.stock.model.AddStockInputParamsModel
import com.abindustrybreeze.features.stock.model.NewStockListResponseModel
import io.reactivex.Observable

/**
 * Created by Saikat on 17-09-2019.
 */
class StockRepository(val apiService: StockApi) {

    fun addStock(addStock: AddStockInputParamsModel): Observable<BaseResponse> {
        return apiService.addStock(addStock)
    }

    fun getStockList(): Observable<NewStockListResponseModel> {
        return apiService.getStockList(Pref.session_token!!, Pref.user_id!!)
    }
}