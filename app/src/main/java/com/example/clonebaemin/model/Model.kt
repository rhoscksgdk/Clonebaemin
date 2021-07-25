package com.example.clonebaemin.model

import android.annotation.SuppressLint
import android.media.browse.MediaBrowser
import android.view.Display
import androidx.recyclerview.widget.DiffUtil

abstract class Model(
    open val id : Long,
    open val type : CellType
){
    companion object{
        val DIFF_CALLBACK : DiffUtil.ItemCallback<Model> = object : DiffUtil.ItemCallback<Model>(){
            override fun areItemsTheSame(oldItem: Model, newItem: Model): Boolean {
                return oldItem.id == newItem.id && oldItem.type == newItem.type
            }

            @SuppressLint("DiffUtilEquals")
            override fun areContentsTheSame(oldItem: Model, newItem: Model): Boolean {
                return oldItem === newItem
            }
        }
    }
}