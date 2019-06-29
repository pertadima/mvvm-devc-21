package id.pertadima.mvvm.data

import com.google.gson.annotations.SerializedName

/**
 * Created by pertadima on 29,June,2019
 */


data class TimeModel(
    @SerializedName("date")
    val date: String?,
    @SerializedName("time")
    val time: String?,
    @SerializedName("timezone")
    val timezone: String?,
    @SerializedName("offset")
    val offset: Int?
)