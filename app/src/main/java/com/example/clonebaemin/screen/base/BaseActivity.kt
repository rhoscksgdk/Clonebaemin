package com.example.clonebaemin.screen.base

import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding
import kotlinx.coroutines.Job

abstract class BaseActivity<VM:BaseViewModel, VB: ViewBinding>:AppCompatActivity() {
    abstract val viewModel:VM

    protected lateinit var binding: VB

    private lateinit var fetchHob: Job
}