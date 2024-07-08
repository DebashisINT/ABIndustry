package com.abindustrybreeze.features.newcollectionreport

import com.abindustrybreeze.features.photoReg.model.UserListResponseModel

interface PendingCollListner {
    fun getUserInfoOnLick(obj: PendingCollData)
}