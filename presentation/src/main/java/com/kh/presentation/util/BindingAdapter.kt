package com.kh.presentation.util

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.kh.presentation.base.BaseAdapter
import com.kh.presentation.screens.models.PostUIState
import com.kh.presentation.screens.posts.PostsAdapter


@BindingAdapter(value = ["adapterRe", "items"], requireAll = false)
fun RecyclerView.setAdapter(adapterRe: RecyclerView.Adapter<*>, items: List<*>?) {
    adapter = adapterRe
    when(adapterRe){
        is PostsAdapter->{  items?.let { adapterRe.setItems(it as List<PostUIState>) }}
    }

}
