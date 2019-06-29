package id.pertadima.mvvm

import android.os.Bundle
import dagger.android.support.DaggerAppCompatActivity
import id.pertadima.mvvm.fragment.HomeFragment
import id.pertadima.mvvm.fragment.HomeViewModel

class MainActivity : DaggerAppCompatActivity() {

    private lateinit var model: HomeViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction().replace(R.id.fl_main, HomeFragment.newInstance())
            .commitAllowingStateLoss()
    }
}
