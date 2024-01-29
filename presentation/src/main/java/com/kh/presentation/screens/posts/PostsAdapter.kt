package com.kh.presentation.screens.posts

import com.kh.presentation.R
import com.kh.presentation.base.BaseAdapter
import com.kh.presentation.base.BaseListener
import com.kh.presentation.screens.models.PostUIState


class PostsAdapter(postsListener:PostsListener):BaseAdapter<PostUIState>(postsListener) {

    interface PostsListener: BaseListener { fun onClickPost() }

    override val layoutIdFragment: Int= R.layout.post_item

}