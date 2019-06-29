package id.pertadima.mvvm.fragment

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel;
import id.pertadima.mvvm.data.JadwalSholatModel
import id.pertadima.mvvm.network.ApiAdapter
import id.pertadima.mvvm.utils.enqueue
import javax.inject.Inject

class HomeViewModel @Inject constructor(private val apiAdapter: ApiAdapter) : ViewModel() {
    private val errorData = MutableLiveData<Throwable>()
    fun observeErrorData(): LiveData<Throwable> = errorData

    private val prayerData = MutableLiveData<JadwalSholatModel>()
    fun observePrayerLiveData() : LiveData<JadwalSholatModel> = prayerData

    private val isLoading = MutableLiveData<Boolean>()
    fun observeIsLoading() : LiveData<Boolean> = isLoading

    fun fetchPrayer(cityName: String) {
        isLoading.postValue(true)
        apiAdapter.getPray(cityName).enqueue {
            onResponse = {
                if (it.code() == 200) {
                    prayerData.postValue(it.body()?.data)
                } else {
                    errorData.postValue(Throwable("Error"))
                }
                isLoading.postValue(false)
            }
            onFailure = {
                errorData.postValue(it)
                isLoading.postValue(true)
            }
        }
    }
}
