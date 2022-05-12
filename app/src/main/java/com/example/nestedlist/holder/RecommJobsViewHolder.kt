package com.example.nestedlist.holder

import androidx.core.view.isGone
import androidx.core.view.isVisible
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.PagerSnapHelper
import androidx.recyclerview.widget.RecyclerView
import com.example.nestedlist.adapter.JobsDefaultAdapter
import com.example.nestedlist.adapter.SkillsDefaultAdapter
import com.example.nestedlist.data.JobsDefault
import com.example.nestedlist.data.RecommJobs
import com.example.nestedlist.data.SkillsDefault
import com.example.nestedlist.databinding.ItemRecommJobsBinding
import com.example.nestedlist.enums.RecommJobType

/**
 * @author Perry Lance
 * @since 2022-04-16 Created
 */
class RecommJobsViewHolder(private val binding: ItemRecommJobsBinding) :
    RecyclerView.ViewHolder(binding.root) {

    private val jobsAdapter = JobsDefaultAdapter().apply {
        submitList(
            listOf(
                JobsDefault(1),
                JobsDefault(2),
                JobsDefault(3),
                JobsDefault(4),
                JobsDefault(5),
                JobsDefault(6)
            )
        )
    }
    private val skillsAdapter = SkillsDefaultAdapter().apply {
        submitList(
            listOf(
                SkillsDefault(1),
                SkillsDefault(2),
                SkillsDefault(3)
            )
        )
    }

    init {
        binding.jobsList.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(
                context,
                LinearLayoutManager.HORIZONTAL,
                false
            )
            adapter = jobsAdapter
            PagerSnapHelper().attachToRecyclerView(this)
        }

        binding.skillsList.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(
                context,
                LinearLayoutManager.HORIZONTAL,
                false
            )
            adapter = skillsAdapter
            PagerSnapHelper().attachToRecyclerView(this)
        }
    }

    fun bind(
        item: RecommJobs
    ) = with(binding) {
        job.isVisible = item.type == RecommJobType.JOB
        skill.isGone = item.type == RecommJobType.JOB
        title.text = item.title
    }
}
