package id.pertadima.mvvm.di

import dagger.Module
import dagger.android.ContributesAndroidInjector
import id.pertadima.mvvm.fragment.HomeFragment

/**
 * Created by pertadima on 29,June,2019
 */

@Module
abstract class FragmentBuilder {
    @ContributesAndroidInjector
    abstract fun bindHomeFragment(): HomeFragment
}