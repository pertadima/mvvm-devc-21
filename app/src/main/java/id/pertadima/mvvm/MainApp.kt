package id.pertadima.mvvm

import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import id.pertadima.mvvm.di.AppComponent
import id.pertadima.mvvm.di.DaggerAppComponent
import id.pertadima.mvvm.di.module.AppModule
import id.pertadima.mvvm.di.module.NetworkModule

/**
 * Created by pertadima on 29,June,2019
 */

class MainApp : DaggerApplication() {

    lateinit var appComponent: AppComponent

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        appComponent = DaggerAppComponent
            .builder()
            .create(this)
            .networkModule(NetworkModule("https://time.siswadi.com/"))
            .build()
        appComponent.inject(this)
        return appComponent
    }
}