package com.abindustrybreeze.features.damageProduct.api

import android.content.Context
import android.net.Uri
import android.text.TextUtils
import android.util.Log
import com.abindustrybreeze.app.FileUtils
import com.abindustrybreeze.base.BaseResponse
import com.abindustrybreeze.features.NewQuotation.model.*
import com.abindustrybreeze.features.addshop.model.AddShopRequestData
import com.abindustrybreeze.features.addshop.model.AddShopResponse
import com.abindustrybreeze.features.damageProduct.model.DamageProductResponseModel
import com.abindustrybreeze.features.damageProduct.model.delBreakageReq
import com.abindustrybreeze.features.damageProduct.model.viewAllBreakageReq
import com.abindustrybreeze.features.login.model.userconfig.UserConfigResponseModel
import com.abindustrybreeze.features.myjobs.model.WIPImageSubmit
import com.abindustrybreeze.features.photoReg.model.*
import com.fasterxml.jackson.databind.ObjectMapper
import com.google.gson.Gson
import io.reactivex.Observable
import okhttp3.MediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody
import java.io.File

class GetDamageProductListRegRepository(val apiService : GetDamageProductListApi) {

    fun viewBreakage(req: viewAllBreakageReq): Observable<DamageProductResponseModel> {
        return apiService.viewBreakage(req)
    }

    fun delBreakage(req: delBreakageReq): Observable<BaseResponse>{
        return apiService.BreakageDel(req.user_id!!,req.breakage_number!!,req.session_token!!)
    }

}