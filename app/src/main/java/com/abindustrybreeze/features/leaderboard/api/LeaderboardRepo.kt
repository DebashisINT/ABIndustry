package com.abindustrybreeze.features.leaderboard.api

import android.content.Context
import android.net.Uri
import android.text.TextUtils
import com.fasterxml.jackson.databind.ObjectMapper
import com.abindustrybreeze.app.FileUtils
import com.abindustrybreeze.app.Pref
import com.abindustrybreeze.base.BaseResponse
import com.abindustrybreeze.features.addshop.model.AddLogReqData
import com.abindustrybreeze.features.addshop.model.AddShopRequestData
import com.abindustrybreeze.features.addshop.model.AddShopResponse
import com.abindustrybreeze.features.addshop.model.LogFileResponse
import com.abindustrybreeze.features.addshop.model.UpdateAddrReq
import com.abindustrybreeze.features.contacts.CallHisDtls
import com.abindustrybreeze.features.contacts.CompanyReqData
import com.abindustrybreeze.features.contacts.ContactMasterRes
import com.abindustrybreeze.features.contacts.SourceMasterRes
import com.abindustrybreeze.features.contacts.StageMasterRes
import com.abindustrybreeze.features.contacts.StatusMasterRes
import com.abindustrybreeze.features.contacts.TypeMasterRes
import com.abindustrybreeze.features.dashboard.presentation.DashboardActivity
import com.abindustrybreeze.features.login.model.WhatsappApiData
import com.abindustrybreeze.features.login.model.WhatsappApiFetchData
import com.google.gson.Gson
import io.reactivex.Observable
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import java.io.File

/**
 * Created by Puja on 10-10-2024.
 */
class LeaderboardRepo(val apiService: LeaderboardApi) {

    fun branchlist(session_token: String): Observable<LeaderboardBranchData> {
        return apiService.branchList(session_token)
    }
    fun ownDatalist(user_id: String,activitybased: String,branchwise: String,flag: String): Observable<LeaderboardOwnData> {
        return apiService.ownDatalist(user_id,activitybased,branchwise,flag)
    }
    fun overAllAPI(user_id: String,activitybased: String,branchwise: String,flag: String): Observable<LeaderboardOverAllData> {
        return apiService.overAllDatalist(user_id,activitybased,branchwise,flag)
    }
}