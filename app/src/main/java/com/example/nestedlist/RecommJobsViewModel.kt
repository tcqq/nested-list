package com.example.nestedlist

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.nestedlist.repository.RecommJobsRepository
import com.example.nestedlist.data.RecommJobs
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

/**
 * @author Perry Lance
 * @since 2021/10/24 Created
 */
@HiltViewModel
class RecommJobsViewModel @Inject constructor(
    private val repository: RecommJobsRepository
) : ViewModel() {

    val jobs = MutableLiveData<ArrayList<RecommJobs>>()

    fun loadJobs() {
        jobs.value = repository.getJobs()
    }
}