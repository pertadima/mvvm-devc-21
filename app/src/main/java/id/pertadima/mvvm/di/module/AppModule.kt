package id.pertadima.mvvm.di.module

import dagger.Module
import dagger.Provides
import id.pertadima.mvvm.network.ApiAdapter
import id.pertadima.mvvm.network.ApiService
import retrofit2.Retrofit
import javax.inject.Singleton

/**
 * Created by pertadima on 29,June,2019
 */

@Module
class AppModule {
    @Provides
    @Singleton
    fun providesNetworkServices(retrofit: Retrofit): ApiService = retrofit.create(ApiService::class.java)

    @Provides
    @Singleton
    fun providesNetworkManager(apiService: ApiService) = ApiAdapter(apiService)
}