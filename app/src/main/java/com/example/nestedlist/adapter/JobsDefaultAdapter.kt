package com.example.nestedlist.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.nestedlist.data.JobsDefault
import com.example.nestedlist.databinding.ItemJobsDefaultBinding

/**
 * @author Perry Lance
 * @since 2022-04-16 Created
 */
class JobsDefaultAdapter : ListAdapter<JobsDefault, JobsDefaultAdapter.ViewHolder>(
    JobsDefaultDiffCallback()
) {

    override fun getItemViewType(position: Int): Int {
        return getItem(position).id
    }

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

        fun bind(item: JobsDefault) = with(binding) {
        }
    }

    class JobsDefaultDiffCallback : DiffUtil.ItemCallback<JobsDefault>() {

        override fun areItemsTheSame(oldItem: JobsDefault, newItem: JobsDefault): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: JobsDefault, newItem: JobsDefault): Boolean {
            return oldItem.id == newItem.id
        }
    }
}
