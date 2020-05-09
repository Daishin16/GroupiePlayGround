package com.example.groupiesample.model

import com.example.groupiesample.R
import com.example.groupiesample.databinding.ItemHeaderBinding
import com.xwray.groupie.databinding.BindableItem

data class HeaderItem(val text: String) : BindableItem<ItemHeaderBinding>(text.hashCode().toLong()) {
    override fun getLayout(): Int = R.layout.item_header

    override fun bind(viewBinding: ItemHeaderBinding, position: Int) {
        viewBinding.header = text
    }
}