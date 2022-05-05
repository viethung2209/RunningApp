package com.hunglee.runningapp.ui.fragments

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.hunglee.runningapp.R
import com.hunglee.runningapp.ui.viewmodels.MainViewModel
import com.hunglee.runningapp.ui.viewmodels.StaticstisViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class StaticsticsFragment : Fragment(R.layout.fragment_staticstics
) {

    private val viewModel : StaticstisViewModel by viewModels()
}