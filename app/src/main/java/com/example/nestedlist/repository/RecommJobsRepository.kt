package com.example.nestedlist.repository

import com.example.nestedlist.data.RecommJobs
import javax.inject.Inject

/**
 * @author Perry Lance
 * @since 2021-10-24 Created
 */
class RecommJobsRepository @Inject constructor() {

    fun getJobs(): ArrayList<RecommJobs> {
        val items = arrayListOf<RecommJobs>()
        items.add(RecommJobs.Job("1", "Job - 1"))
        items.add(RecommJobs.Skill("2", "Job - 2"))
        items.add(RecommJobs.Job("3", "Job - 3"))
        items.add(RecommJobs.Job("4", "Job - 4"))
        items.add(RecommJobs.Job("5", "Job - 5"))
        items.add(RecommJobs.Skill("6", "Job - 6"))
        items.add(RecommJobs.Job("7", "Job - 7"))
        items.add(RecommJobs.Job("8", "Job - 8"))
        items.add(RecommJobs.Job("9", "Job - 9"))
        items.add(RecommJobs.Job("10", "Job - 10"))
        return items
    }
}
