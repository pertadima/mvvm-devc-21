package id.pertadima.mvvm.network


import id.pertadima.mvvm.data.JadwalSholatResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * Created by pertadima on 29,June,2019
 */

interface ApiService {
    @GET("pray/{city}")
    fun getPray(@Path("city") cityName: String): Call<JadwalSholatResponse>
}