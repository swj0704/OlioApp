package org.software.meister.gsm.olio.view.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import org.koin.androidx.viewmodel.ext.android.getViewModel
import org.software.meister.gsm.olio.R
import org.software.meister.gsm.olio.base.BaseFragment
import org.software.meister.gsm.olio.databinding.FragmentGuide1Binding
import org.software.meister.gsm.olio.viewmodel.fragment.Guide1ViewModel

class GuideFragment1 : BaseFragment<FragmentGuide1Binding, Guide1ViewModel>() {
    override val viewModel: Guide1ViewModel
        get() = getViewModel(Guide1ViewModel::class)
    override val resource: Int
        get() = R.layout.fragment_guide1

    override fun init() {

    }

    override fun observerViewModel() {

    }
}