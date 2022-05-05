package com.hunglee.runningapp.ui.viewmodels

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import com.hunglee.runningapp.repositories.MainRepository

class StaticstisViewModel @ViewModelInject constructor(
    val mainRepository: MainRepository
) : ViewModel() {

}