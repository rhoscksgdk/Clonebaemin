package com.example.clonebaemin.widget.adapter

import android.os.Parcel
import android.os.Parcelable
import android.view.ViewGroup
import android.widget.ListAdapter
import com.example.clonebaemin.model.Model
import com.example.clonebaemin.screen.base.BaseViewModel
import com.example.clonebaemin.util.provider.ResourceProvider
import com.example.clonebaemin.widget.adapter.listener.AdapterListener
import com.example.clonebaemin.widget.adapter.viewholder.ModelViewHolder

class ModelRecyclerAdapter<M: Model, VM: BaseViewModel>(
    private var modelList: List<Model>,
    private val viewModel: VM,
    private val resourceProvider: ResourceProvider,
    private val adapterListener: AdapterListener
    ):ListAdapter<Model, ModelViewHolder<M>>(Model.DIFF_CALLBACK) {

    override fun getItemCount():Int = modelList.size

    override fun getItemViewType(position: Int):Int = modelList[position].type.ordinal

    override fun onCreateViewHolder(parent:ViewGroup, viewType:Int):ModelViewHolder<M>{

        }

    override fun onBindViewHolder(holder: ModelViewHolder<M>,position:Int){

    }


}
//17:46
