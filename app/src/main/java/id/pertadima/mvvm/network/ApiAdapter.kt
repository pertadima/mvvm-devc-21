package id.pertadima.mvvm.network

import id.pertadima.mvvm.data.JadwalSholatResponse
import retrofit2.Call
import javax.inject.Inject

/**
 * Created by pertadima on 29,June,2019
 */


class ApiAdapter @Inject constructor(private val apiService: ApiService) {
    fun getPray(cityName: String) : Call<JadwalSholatResponse> {
        return apiService.getPray(cityName)
    }
}