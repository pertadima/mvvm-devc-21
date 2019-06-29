package id.pertadima.mvvm.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import id.pertadima.mvvm.MainActivity

/**
 * Created by pertadima on 29,June,2019
 */


@Module
abstract class ActivityBuilder {
    @ContributesAndroidInjector
    abstract fun bindMainActivity(): MainActivity
}