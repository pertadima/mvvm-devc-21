package id.pertadima.mvvm.data

import com.google.gson.annotations.SerializedName

/**
 * Created by pertadima on 29,June,2019
 */



data class JadwalSholatModel(
    @SerializedName("Fajr")
    val fajr: String?,
    @SerializedName("Sunrise")
    val sunrise: String?,
    @SerializedName("Dhuhr")
    val dhuhr: String?,
    @SerializedName("Asr")
    val asr: String?,
    @SerializedName("Sunset")
    val sunset: String?,
    @SerializedName("Maghrib")
    val maghrib: String?,
    @SerializedName("Isha")
    val isha: String?,
    @SerializedName("SepertigaMalam")
    val sepertigaMalam: String?,
    @SerializedName("TengahMalam")
    val tengahMalam: String?,
    @SerializedName("DuapertigaMalam")
    val duapertigaMalam: String?,
    @SerializedName("method")
    val method: List<String?>?
)