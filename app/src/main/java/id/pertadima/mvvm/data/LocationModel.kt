package id.pertadima.mvvm.data

import com.google.gson.annotations.SerializedName

/**
 * Created by pertadima on 29,June,2019
 */

data class LocationModel(
    @SerializedName("latitude")
    val latitude: String?,
    @SerializedName("longitude")
    val longitude: String?,
    @SerializedName("address")
    val address: String?
)