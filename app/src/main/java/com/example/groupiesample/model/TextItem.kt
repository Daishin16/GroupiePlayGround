package com.example.groupiesample.model

import com.example.groupiesample.R
import com.example.groupiesample.databinding.ItemTextBinding
import com.xwray.groupie.databinding.BindableItem

data class TextItem(val text: String) : BindableItem<ItemTextBinding>(text.hashCode().toLong()) {
    override fun getLayout(): Int = R.layout.item_text

    override fun bind(viewBinding: ItemTextBinding, position: Int) {
        viewBinding.textView.text = text
    }
}