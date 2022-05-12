package com.example.nestedlist.repository

import com.example.nestedlist.data.RecommJobs
import com.example.nestedlist.enums.RecommJobType
import javax.inject.Inject

/**
 * @author Perry Lance
 * @since 2021-10-24 Created
 */
class RecommJobsRepository @Inject constructor() {

    fun getJobs(): ArrayList<RecommJobs> {
        val items = arrayListOf<RecommJobs>()
        items.add(RecommJobs(1, RecommJobType.JOB, "Job - 1"))
        items.add(RecommJobs(2, RecommJobType.SKILL, "Job - 2"))
        items.add(RecommJobs(3, RecommJobType.JOB, "Job - 3"))
        items.add(RecommJobs(4, RecommJobType.JOB, "Job - 4"))
        items.add(RecommJobs(5, RecommJobType.JOB, "Job - 5"))
        items.add(RecommJobs(6, RecommJobType.JOB, "Job - 6"))
        items.add(RecommJobs(7, RecommJobType.JOB, "Job - 7"))
        items.add(RecommJobs(8, RecommJobType.JOB, "Job - 8"))
        items.add(RecommJobs(9, RecommJobType.JOB, "Job - 9"))
        items.add(RecommJobs(10, RecommJobType.JOB, "Job - 10"))
        return items
    }
}
