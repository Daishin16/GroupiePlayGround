package com.example.groupiesample

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.groupiesample.databinding.FragmentListBinding
import com.example.groupiesample.model.HeaderItem
import com.example.groupiesample.model.TextItem
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.GroupieViewHolder

class ListFragment : Fragment(R.layout.fragment_list) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val binding = FragmentListBinding.bind(view)
        val groupAdapter = GroupAdapter<GroupieViewHolder>()
        val items = listOf(
            HeaderItem("Header1"),
            TextItem("Item1"),
            TextItem("Item2"),
            HeaderItem("Header2"),
            TextItem("Item3"),
            TextItem("item4")
        )
        items.forEach{ items ->
            groupAdapter.add(items)
        }
        binding.recyclerView.adapter = groupAdapter
        binding.recyclerView.layoutManager = LinearLayoutManager(context)
        binding.lifecycleOwner = viewLifecycleOwner
    }
}