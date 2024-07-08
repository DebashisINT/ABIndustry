package com.abindustrybreeze.features.lead.api

import com.abindustrybreeze.features.NewQuotation.api.GetQuotListRegRepository
import com.abindustrybreeze.features.NewQuotation.api.GetQutoListApi


object GetLeadRegProvider {
    fun provideList(): GetLeadListRegRepository {
        return GetLeadListRegRepository(GetLeadListApi.create())
    }
}