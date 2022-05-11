package com.example.nestedlist.data

import com.example.nestedlist.enums.RecommJobType

/**
 * @author Perry Lance
 * @since 2021-10-24 Created
 */
sealed class RecommJobs(
    open val id: String,
    open val title: String,
    val type: RecommJobType
) {
    data class Job(
        override val id: String,
        override val title: String
    ) : RecommJobs(id, title, RecommJobType.JOB)

    data class Skill(
        override val id: String,
        override val title: String
    ) : RecommJobs(id, title, RecommJobType.SKILL)
}