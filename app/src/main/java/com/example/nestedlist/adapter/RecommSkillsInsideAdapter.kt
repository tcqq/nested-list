package com.example.nestedlist.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.nestedlist.data.RecommSkillsInside
import com.example.nestedlist.databinding.ItemRecommSkillsInsideBinding

/**
 * @author Perry Lance
 * @since 2021-04-25 Created
 */
class RecommSkillsInsideAdapter : ListAdapter<RecommSkillsInside, RecommSkillsInsideAdapter.ViewHolder>(
    RecommSkillsInsideDiffCallback()
) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ViewHolder(
        ItemRecommSkillsInsideBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    )

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    inner class ViewHolder(
        private val binding: ItemRecommSkillsInsideBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(item: RecommSkillsInside) = with(binding) {
//            title1.text = item.name1
        }
    }

    class RecommSkillsInsideDiffCallback : DiffUtil.ItemCallback<RecommSkillsInside>() {

        override fun areItemsTheSame(
            oldItem: RecommSkillsInside,
            newItem: RecommSkillsInside
        ): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(
            oldItem: RecommSkillsInside,
            newItem: RecommSkillsInside
        ): Boolean {
            return oldItem.id == newItem.id
        }
    }
}
