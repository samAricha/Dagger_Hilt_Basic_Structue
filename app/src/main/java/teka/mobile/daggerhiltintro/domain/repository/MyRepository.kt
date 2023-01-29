package teka.mobile.daggerhiltintro.domain.repository

//abstracting out the implementation details of actual repository
interface MyRepository {
    suspend fun doNetworkCall()

}