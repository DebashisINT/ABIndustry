package com.abindustrybreeze.features.reimbursement.api.deleteimageapi

import com.abindustrybreeze.app.Pref
import com.abindustrybreeze.base.BaseResponse
import io.reactivex.Observable

/**
 * Created by Saikat on 08-02-2019.
 */
class DeleteImageRepo(val apiService: DeleteImageApi) {
    fun deleteReimbursementImage(Id: String): Observable<BaseResponse> {
        return apiService.deleteReimbursementImage(Pref.user_id!!, Pref.session_token!!, Id)
    }
}