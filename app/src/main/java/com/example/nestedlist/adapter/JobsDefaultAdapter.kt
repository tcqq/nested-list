package com.example.nestedlist.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.nestedlist.data.Jobs
import com.example.nestedlist.databinding.ItemJobsDefaultBinding

/**
 * @author Perry Lance
 * @since 2022-04-16 Created
 */
class JobsDefaultAdapter : ListAdapter<Jobs, JobsDefaultAdapter.ViewHolder>(
    JobsDefaultDiffCallback()
) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ViewHolder(
        ItemJobsDefaultBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    )

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    inner class ViewHolder(
        private val binding: ItemJobsDefaultBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        private val context = itemView.context

        fun bind(item: Jobs) = with(binding) {
        }
    }

    class JobsDefaultDiffCallback : DiffUtil.ItemCallback<Jobs>() {

        override fun areItemsTheSame(oldItem: Jobs, newItem: Jobs): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: Jobs, newItem: Jobs): Boolean {
            return oldItem.id == newItem.id
        }
    }
}
