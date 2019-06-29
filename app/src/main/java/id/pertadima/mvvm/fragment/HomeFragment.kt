package id.pertadima.mvvm.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.view.isVisible
import androidx.lifecycle.Observer
import dagger.android.support.DaggerFragment
import id.pertadima.mvvm.R
import kotlinx.android.synthetic.main.fragment_home.*
import javax.inject.Inject

class HomeFragment : DaggerFragment() {
    companion object {
        fun newInstance() = HomeFragment()
    }

    @Inject
    lateinit var viewModel: HomeViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.fetchPrayer("Jakarta")
        observeViewModel()
    }

    private fun observeViewModel() {
        with(viewModel) {
            observePrayerLiveData().observe(this@HomeFragment, Observer {
                tv_fajr.text = getString(R.string.a2, it.fajr)
                tv_dhuhr.text = getString(R.string.a2, it.dhuhr)
                tv_ashr.text = getString(R.string.a2, it.asr)
                tv_magrib.text = getString(R.string.a2, it.maghrib)
                tv_isha.text = getString(R.string.a2, it.isha)
            })

            observeErrorData().observe(this@HomeFragment, Observer {
                Toast.makeText(activity, it.localizedMessage, Toast.LENGTH_SHORT).show()
            })

            observeIsLoading().observe(this@HomeFragment, Observer {
                pb_home.isVisible = it
            })
        }
    }
}
