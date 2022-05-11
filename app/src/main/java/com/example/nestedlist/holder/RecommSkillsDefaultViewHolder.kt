package com.example.nestedlist.holder

import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.nestedlist.adapter.SkillsDefaultAdapter
import com.example.nestedlist.data.RecommJobs
import com.example.nestedlist.data.SkillsDefault
import com.example.nestedlist.databinding.ItemRecommSkillsDefaultBinding
import com.example.nestedlist.utils.StartSnapHelper

/**
 * @author Perry Lance
 * @since 2021-04-25 Created
 */
class RecommSkillsDefaultViewHolder(private val binding: ItemRecommSkillsDefaultBinding) :
    RecyclerView.ViewHolder(binding.root) {

    private val skillsDefaultAdapter = SkillsDefaultAdapter().apply {
        submitList(
            listOf(
                SkillsDefault(
                    "1"
                ),
                SkillsDefault(
                    "2"
                ),
                SkillsDefault(
                    "3"
                )
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
            adapter = skillsDefaultAdapter
            StartSnapHelper().attachToRecyclerView(this)
        }
    }

    fun bindJob(
        item: RecommJobs.Skill
    ) = with(binding) {
        title.text = item.title
    }
}
