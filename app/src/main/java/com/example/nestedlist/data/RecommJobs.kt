package com.example.nestedlist.data

import com.example.nestedlist.enums.RecommJobType

/**
 * @author Perry Lance
 * @since 2021-10-24 Created
 */
data class RecommJobs(
    val id: Int,
    val type: RecommJobType,
    val title: String)
