package com.example.nestedlist

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.nestedlist.adapter.RecommJobsAdapter
import com.example.nestedlist.databinding.ActivityMainBinding
import com.example.nestedlist.utils.observe
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val viewModel by viewModels<RecommJobsViewModel>()
    private lateinit var jobsAdapter: RecommJobsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        setSupportActionBar(binding.toolbar)

        jobsAdapter = RecommJobsAdapter()
        binding.recyclerView.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(context)
            adapter = jobsAdapter
        }
        viewModel.loadJobs()

        observe(viewModel.jobs) {
            jobsAdapter.submitList(it)
        }
    }
}