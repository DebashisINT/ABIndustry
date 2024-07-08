package com.abindustrybreeze.features.survey.api

import com.abindustrybreeze.features.photoReg.api.GetUserListPhotoRegApi
import com.abindustrybreeze.features.photoReg.api.GetUserListPhotoRegRepository

object SurveyDataProvider{

    fun provideSurveyQ(): SurveyDataRepository {
        return SurveyDataRepository(SurveyDataApi.create())
    }

    fun provideSurveyQMultiP(): SurveyDataRepository {
        return SurveyDataRepository(SurveyDataApi.createImage())
    }
}