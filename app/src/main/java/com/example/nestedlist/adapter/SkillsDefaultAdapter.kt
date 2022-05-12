package com.example.nestedlist.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.nestedlist.data.SkillsDefault
import com.example.nestedlist.databinding.ItemSkillsDefaultBinding

/**
 * @author Perry Lance
 * @since 2021-04-25 Created
 */
class SkillsDefaultAdapter : ListAdapter<SkillsDefault, SkillsDefaultAdapter.ViewHolder>(
    SkillsDefaultDiffCallback()
) {

    override fun getItemViewType(position: Int): Int {
        return getItem(position).id
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ViewHolder(
        ItemSkillsDefaultBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    )

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    inner class ViewHolder(
        private val binding: ItemSkillsDefaultBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(item: SkillsDefault) = with(binding) {
//            title1.text = item.name1
        }
    }

    class SkillsDefaultDiffCallback : DiffUtil.ItemCallback<SkillsDefault>() {

        override fun areItemsTheSame(
            oldItem: SkillsDefault,
            newItem: SkillsDefault
        ): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(
            oldItem: SkillsDefault,
            newItem: SkillsDefault
        ): Boolean {
            return oldItem.id == newItem.id
        }
    }
}
