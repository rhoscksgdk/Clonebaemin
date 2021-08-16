package com.example.clonebaemin.widget.adapter.viewholder

import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding
import com.example.clonebaemin.databinding.ViewholderEmptyBinding
import com.example.clonebaemin.model.Model
import com.example.clonebaemin.screen.base.BaseViewModel
import com.example.clonebaemin.util.mapper.ModelViewHolderMapper
import com.example.clonebaemin.util.provider.ResourceProvider
import com.example.clonebaemin.widget.adapter.listener.AdapterListener

class EmptyViewHolder(
    private val binding: ViewholderEmptyBinding,
    viewModel:BaseViewModel,
    resourceProvider: ResourceProvider
):ModelViewHolder<Model>(binding, viewModel,resourceProvider){

    override fun reset() = Unit

    override fun bindViews(model: Model, adapterListener: AdapterListener) = Unit
}