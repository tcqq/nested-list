package com.example.nestedlist.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import com.example.nestedlist.data.RecommJobs
import com.example.nestedlist.databinding.ItemRecommJobsBinding
import com.example.nestedlist.holder.RecommJobsViewHolder

/**
 * @author Perry Lance
 * @since 2021-10-24 Created
 */
class RecommJobsAdapter : ListAdapter<RecommJobs, RecommJobsViewHolder>(
    RecommJobsDiffCallback()
) {

    override fun getItemViewType(position: Int): Int {
        return getItem(position).id.hashCode()
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): RecommJobsViewHolder = RecommJobsViewHolder(
        ItemRecommJobsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    )

    override fun onBindViewHolder(holder: RecommJobsViewHolder, position: Int) {
        holder.bind(getItem(position))
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
