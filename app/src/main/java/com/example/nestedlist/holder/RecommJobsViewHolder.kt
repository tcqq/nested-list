package com.example.nestedlist.holder

import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.PagerSnapHelper
import androidx.recyclerview.widget.RecyclerView
import com.example.nestedlist.data.Jobs
import com.example.nestedlist.adapter.JobsDefaultAdapter
import com.example.nestedlist.data.RecommJobs
import com.example.nestedlist.databinding.ItemRecommJobsDefaultBinding

/**
 * @author Perry Lance
 * @since 2022-04-16 Created
 */
class RecommJobsViewHolder(private val binding: ItemRecommJobsDefaultBinding) :
    RecyclerView.ViewHolder(binding.root) {

    private val jobsAdapter = JobsDefaultAdapter().apply {
        submitList(
            listOf(
                Jobs("1"),
                Jobs("2"),
                Jobs("3"),
                Jobs("4"),
                Jobs("5"),
                Jobs("6")
            )
        )
    }

    init {
        binding.recyclerView.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(
                context,
                LinearLayoutManager.HORIZONTAL,
                false
            )
            adapter = jobsAdapter
            PagerSnapHelper().attachToRecyclerView(this)
        }
    }

    fun bind(
        item: RecommJobs.Job
    ) = with(binding) {
        title.text = item.title
    }
}
