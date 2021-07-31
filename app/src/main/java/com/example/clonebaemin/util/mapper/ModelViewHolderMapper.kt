package com.example.clonebaemin.util.mapper

import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.ViewParent
import com.example.clonebaemin.model.CellType
import com.example.clonebaemin.model.Model
import com.example.clonebaemin.screen.base.BaseViewModel
import com.example.clonebaemin.util.provider.ResourceProvider
import com.example.clonebaemin.widget.adapter.viewholder.ModelViewHolder

object ModelViewHolderMapper {
    fun <M: Model>map(
        parent:ViewGroup,
        type:CellType,
        viewModel: BaseViewModel,
        resourceProvider: ResourceProvider
    ):ModelViewHolder<M>{
        val inflater = LayoutInflater.from(parent.context)
        val viewHolder = when(type){
            CellType.EMPTY_CELL -> ModelViewHolder(

            )
        }
        return viewHolder as ModelViewHolder<M>
    }

}