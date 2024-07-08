package com.abindustrybreeze.features.nearbyuserlist.api

import com.abindustrybreeze.app.Pref
import com.abindustrybreeze.features.nearbyuserlist.model.NearbyUserResponseModel
import com.abindustrybreeze.features.newcollection.model.NewCollectionListResponseModel
import com.abindustrybreeze.features.newcollection.newcollectionlistapi.NewCollectionListApi
import io.reactivex.Observable

class NearbyUserRepo(val apiService: NearbyUserApi) {
    fun nearbyUserList(): Observable<NearbyUserResponseModel> {
        return apiService.getNearbyUserList(Pref.session_token!!, Pref.user_id!!)
    }
}