package com.abindustrybreeze.features.document.api

import com.abindustrybreeze.features.dymanicSection.api.DynamicApi
import com.abindustrybreeze.features.dymanicSection.api.DynamicRepo

object DocumentRepoProvider {
    fun documentRepoProvider(): DocumentRepo {
        return DocumentRepo(DocumentApi.create())
    }

    fun documentRepoProviderMultipart(): DocumentRepo {
        return DocumentRepo(DocumentApi.createImage())
    }
}