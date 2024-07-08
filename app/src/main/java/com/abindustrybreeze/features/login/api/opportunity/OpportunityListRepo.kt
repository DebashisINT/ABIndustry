package com.abindustrybreeze.features.login.api.opportunity

import com.abindustrybreeze.app.Pref
import com.abindustrybreeze.app.utils.AppUtils
import com.abindustrybreeze.base.BaseResponse
import com.abindustrybreeze.features.login.model.opportunitymodel.OpportunityStatusListResponseModel
import com.abindustrybreeze.features.login.model.productlistmodel.ProductListResponseModel
import com.abindustrybreeze.features.orderITC.SyncDeleteOppt
import com.abindustrybreeze.features.orderITC.SyncEditOppt
import com.abindustrybreeze.features.orderITC.SyncOppt
import com.abindustrybreeze.features.orderList.model.OpportunityListResponseModel
import io.reactivex.Observable
import timber.log.Timber

/**
 * Created by Saikat on 20-11-2018.
 */
class OpportunityListRepo(val apiService: OpportunityListApi) {
    fun getOpportunityStatus(session_token: String): Observable<OpportunityStatusListResponseModel> {
        return apiService.getOpportunityStatusList(session_token)
    }

    fun saveOpportunity(syncOppt: SyncOppt): Observable<BaseResponse> {
        return apiService.saveOpportunity(syncOppt)
    }

    fun editOpportunity(syncEditOppt: SyncEditOppt): Observable<BaseResponse> {
        return apiService.editOpportunity(syncEditOppt)
    }
    fun deleteOpportunity(syncDeleteOppt: SyncDeleteOppt): Observable<BaseResponse> {
        return apiService.deleteOpportunity(syncDeleteOppt)
    }
    fun getOpportunityL(user_id: String): Observable<OpportunityListResponseModel> {
        return apiService.getOpportunityL(user_id)
    }
}