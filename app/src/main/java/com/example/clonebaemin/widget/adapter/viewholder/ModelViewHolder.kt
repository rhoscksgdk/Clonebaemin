package com.example.clonebaemin.widget.adapter.viewholder

import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding
import com.example.clonebaemin.screen.base.BaseViewModel
import com.example.clonebaemin.util.provider.ResourceProvider
import com.example.clonebaemin.widget.adapter.listener.AdapterListener

abstract class ModelViewHolder<M: Model>(
    binding:ViewBinding,
    protected val viewModel: BaseViewModel,
    protected val resourceProvider: ResourceProvider
):RecyclerView.ViewHolder(binding.root){
    abstract fun reset()

    open fun bindData(model:M){
        reset()
    }

    abstract fun bindViews(model:M, adapterListener: AdapterListener)
}