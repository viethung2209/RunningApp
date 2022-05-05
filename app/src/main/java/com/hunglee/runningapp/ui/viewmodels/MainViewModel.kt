package com.hunglee.runningapp.ui.viewmodels

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.MediatorLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.hunglee.runningapp.db.Run
import com.hunglee.runningapp.other.SortType
import com.hunglee.runningapp.repositories.MainRepository
import kotlinx.coroutines.launch

class MainViewModel @ViewModelInject constructor(
    val mainRepository: MainRepository
) : ViewModel() {

    private val runsSortByDate = mainRepository.getAllRunSortByDate()
    private val runsSortByDistance = mainRepository.getAllRunSortByDistance()
    private val runsSortByCaloriesBurn = mainRepository.getAllRunSortByCaloriesBurned()
    private val runsSortByTimeInMilles = mainRepository.getAllRunSortByTimeInMillis()
    private val runsSortByAvgSpeed = mainRepository.getAllRunSortByAvgSpeed()

    val runs = MediatorLiveData<List<Run>>()

    var sortType = SortType.DATE

    init {
        runs.addSource(
            runsSortByDate
        ) { result ->
            if (sortType == SortType.DATE) {
                result?.let { runs.value = it }
            }
        }
        runs.addSource(
            runsSortByAvgSpeed
        ) { result ->
            if (sortType == SortType.AVGSPEED) {
                result?.let { runs.value = it }
            }
        }
        runs.addSource(
            runsSortByDistance
        ) { result ->
            if (sortType == SortType.DISTANCE) {
                result?.let { runs.value = it }
            }
        }
        runs.addSource(
            runsSortByTimeInMilles
        ) { result ->
            if (sortType == SortType.RUNING_TIME) {
                result?.let { runs.value = it }
            }
        }
        runs.addSource(
            runsSortByCaloriesBurn
        ) { result ->
            if (sortType == SortType.CALORIES_BURNED) {
                result?.let { runs.value = it }
            }
        }

    }

    fun sortRuns(sortType: SortType) = when (sortType) {
        SortType.DATE -> runsSortByDate.value?.let { runs.value = it }
        SortType.RUNING_TIME -> runsSortByTimeInMilles.value?.let { runs.value = it }
        SortType.AVGSPEED -> runsSortByAvgSpeed.value?.let { runs.value = it }
        SortType.DISTANCE -> runsSortByDistance.value?.let { runs.value = it }
        SortType.CALORIES_BURNED -> runsSortByCaloriesBurn.value?.let { runs.value = it }
    }.also {
        this.sortType = sortType
    }

    fun insertRun(run: Run) = viewModelScope.launch {
        mainRepository.insertRun(run)
    }
}