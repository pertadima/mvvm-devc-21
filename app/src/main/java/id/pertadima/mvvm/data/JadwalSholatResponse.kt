package id.pertadima.mvvm.data
import com.google.gson.annotations.SerializedName


/**
 * Created by pertadima on 29,June,2019
 */

data class JadwalSholatResponse(
    @SerializedName("data")
    val data: JadwalSholatModel?,
    @SerializedName("time")
    val time: TimeModel?,
    @SerializedName("location")
    val location: LocationModel?,
    @SerializedName("status")
    val status: String?
)
