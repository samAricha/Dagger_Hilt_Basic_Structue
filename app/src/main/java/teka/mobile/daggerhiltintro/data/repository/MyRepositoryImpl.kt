package teka.mobile.daggerhiltintro.data.repository

import android.app.Application
import teka.mobile.daggerhiltintro.R
import teka.mobile.daggerhiltintro.data.remote.MyApi
import teka.mobile.daggerhiltintro.domain.repository.MyRepository
import javax.inject.Inject

class MyRepositoryImpl @Inject constructor(
    private val api: MyApi,
    private val appContext: Application
): MyRepository {

    init {
        val appName = appContext.getString(R.string.app_name)
        println("Hello from the repository. The app name is $appName")

    }
    override suspend fun doNetworkCall() {
        TODO("Not yet implemented")
    }
}