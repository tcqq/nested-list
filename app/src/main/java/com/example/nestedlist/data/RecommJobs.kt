package com.example.nestedlist.data

/**
 * @author Perry Lance
 * @since 2021-10-24 Created
 */
sealed class RecommJobs(
    open val id: String,
    open val title: String
) {
    data class Job(
        override val id: String,
        override val title: String
    ) : RecommJobs(id, title)

    data class Skill(
        override val id: String,
        override val title: String
    ) : RecommJobs(id, title)
}