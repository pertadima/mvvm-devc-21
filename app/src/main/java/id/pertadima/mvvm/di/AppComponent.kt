package id.pertadima.mvvm.di

import android.app.Application
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import dagger.android.support.AndroidSupportInjectionModule
import id.pertadima.mvvm.MainApp
import id.pertadima.mvvm.di.module.AppModule
import id.pertadima.mvvm.di.module.NetworkModule
import javax.inject.Singleton

/**
 * Created by pertadima on 29,June,2019
 */
@Singleton
@Component(
    modules = [
        AndroidSupportInjectionModule::class,
        NetworkModule::class,
        AppModule::class,
        ActivityBuilder::class,
        FragmentBuilder::class
    ]
)

interface AppComponent : AndroidInjector<MainApp> {
    fun inject(instance: DaggerApplication)
    override fun inject(application: MainApp)

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun create(app: Application): Builder
        fun networkModule(networkModule: NetworkModule): Builder
        fun build(): AppComponent
    }
}