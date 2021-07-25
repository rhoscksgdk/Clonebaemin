package com.example.clonebaemin.widget.adapter

import com.example.clonebaemin.model.Model
import com.example.clonebaemin.screen.base.BaseViewModel
import com.example.clonebaemin.util.provider.ResourceProvider

class ModelRecyclerAdapter<M: Model, VM: BaseViewModel>(
    private var modelList: List<Model>,
    private val viewModel: VM,
    private val resourceProvider: ResourceProvider,


) {

}