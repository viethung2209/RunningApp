package com.hunglee.runningapp.repositories

import com.hunglee.runningapp.db.Run
import com.hunglee.runningapp.db.RunDao
import javax.inject.Inject

class MainRepository @Inject constructor(
    val runDao: RunDao
) {
    suspend fun insertRun(run: Run) = runDao.insertRun(run)

    suspend fun deleteRun(run: Run) = runDao.deleteRun(run)

    fun getAllRunSortByDate() = runDao.getAllRunsSortedByDate()

    fun getAllRunSortByDistance() = runDao.getAllRunsSortedByDistance()

    fun getAllRunSortByTimeInMillis() = runDao.getAllRunsSortedByTimeInMillis()

    fun getAllRunSortByAvgSpeed() = runDao.getAllRunsSortedByAvgSpeed()

    fun getAllRunSortByCaloriesBurned() = runDao.getAllRunsSortedByCaloriesBurn()

    fun getTotalAvgSpeed() = runDao.getTotalAvgSpeed()

    fun getTotalCalorisBurned() = runDao.getTotalCaloriesBurn()

    fun getTotalTimeInMillis() = runDao.getTotalTimeInMillis()

    fun getTotalDistance() = runDao.getTotalDistance()

}