package com.example.nestedlist.holder

import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.PagerSnapHelper
import androidx.recyclerview.widget.RecyclerView
import com.example.nestedlist.adapter.JobsDefaultAdapter
import com.example.nestedlist.data.JobsDefault
import com.example.nestedlist.data.RecommJobs
import com.example.nestedlist.databinding.ItemRecommJobsDefaultBinding

/**
 * @author Perry Lance
 * @since 2022-04-16 Created
 */
class RecommJobsDefaultViewHolder(private val binding: ItemRecommJobsDefaultBinding) :
    RecyclerView.ViewHolder(binding.root) {

    private val jobsDefaultAdapter = JobsDefaultAdapter().apply {
        submitList(
            listOf(
                JobsDefault("1"),
                JobsDefault("2"),
                JobsDefault("3"),
                JobsDefault("4"),
                JobsDefault("5"),
                JobsDefault("6")
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
            adapter = jobsDefaultAdapter
            PagerSnapHelper().attachToRecyclerView(this)
        }
    }

    fun bind(
        item: RecommJobs.Job
    ) = with(binding) {
        title.text = item.title
    }
}
