package com.abindustrybreeze.features.photoReg.present

import com.abindustrybreeze.app.domain.ProspectEntity
import com.abindustrybreeze.features.photoReg.model.UserListResponseModel

interface DsStatusListner {
    fun getDSInfoOnLick(obj: ProspectEntity)
}