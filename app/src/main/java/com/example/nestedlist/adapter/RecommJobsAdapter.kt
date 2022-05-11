package com.example.nestedlist.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.nestedlist.data.RecommJobs
import com.example.nestedlist.databinding.ItemRecommJobsDefaultBinding
import com.example.nestedlist.databinding.ItemRecommSkillsDefaultBinding
import com.example.nestedlist.enums.RecommJobType
import com.example.nestedlist.holder.RecommJobsDefaultViewHolder
import com.example.nestedlist.holder.RecommSkillsDefaultViewHolder

/**
 * @author Perry Lance
 * @since 2021-10-24 Created
 */
class RecommJobsAdapter : ListAdapter<RecommJobs, RecyclerView.ViewHolder>(
    RecommJobsDiffCallback()
) {

    override fun getItemViewType(position: Int): Int {
        return getItem(position).type.value
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): RecyclerView.ViewHolder = when (viewType) {
        RecommJobType.JOB.value -> RecommJobsDefaultViewHolder(
            ItemRecommJobsDefaultBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
        RecommJobType.SKILL.value -> RecommSkillsDefaultViewHolder(
            ItemRecommSkillsDefaultBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
        else -> throw NullPointerException("View holder for type $viewType not found")
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is RecommJobsDefaultViewHolder -> {
                val job = getItem(position) as RecommJobs.Job
                holder.bind(job)
            }
            is RecommSkillsDefaultViewHolder -> {
                val skill = getItem(position) as RecommJobs.Skill
                holder.bindJob(skill)
            }
        }
    }

    class RecommJobsDiffCallback : DiffUtil.ItemCallback<RecommJobs>() {

        override fun areItemsTheSame(
            oldItem: RecommJobs,
            newItem: RecommJobs
        ): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(
            oldItem: RecommJobs,
            newItem: RecommJobs
        ): Boolean {
            return oldItem.id == newItem.id
        }
    }
}
