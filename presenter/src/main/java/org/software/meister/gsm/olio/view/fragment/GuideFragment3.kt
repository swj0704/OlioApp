package org.software.meister.gsm.olio.view.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import org.koin.androidx.viewmodel.ext.android.getViewModel
import org.software.meister.gsm.olio.R
import org.software.meister.gsm.olio.base.BaseFragment
import org.software.meister.gsm.olio.databinding.FragmentGuide3Binding
import org.software.meister.gsm.olio.viewmodel.fragment.Guide3ViewModel

class GuideFragment3 : BaseFragment<FragmentGuide3Binding, Guide3ViewModel>() {
    override val viewModel: Guide3ViewModel
        get() = getViewModel(Guide3ViewModel::class)
    override val resource: Int
        get() = R.layout.fragment_guide3

    override fun init() {

    }

    override fun observerViewModel() {

    }

}