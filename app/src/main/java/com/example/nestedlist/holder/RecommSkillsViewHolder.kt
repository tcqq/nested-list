package com.example.nestedlist.holder

import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.nestedlist.data.RecommSkillsInside
import com.example.nestedlist.adapter.RecommSkillsInsideAdapter
import com.example.nestedlist.data.RecommJobs
import com.example.nestedlist.databinding.ItemRecommSkillsBinding
import com.example.nestedlist.utils.StartSnapHelper

/**
 * @author Perry Lance
 * @since 2021-04-25 Created
 */
class RecommSkillsViewHolder(private val binding: ItemRecommSkillsBinding) :
    RecyclerView.ViewHolder(binding.root) {

    private val skillsInsideAdapter = RecommSkillsInsideAdapter().apply {
        submitList(
            listOf(
                RecommSkillsInside(
                    "1"
                ),
                RecommSkillsInside(
                    "2"
                ),
                RecommSkillsInside(
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
            adapter = skillsInsideAdapter
            StartSnapHelper().attachToRecyclerView(this)
        }
    }

    fun bindJob(
        item: RecommJobs.Skill
    ) = with(binding) {
        title.text = item.title
    }
}
