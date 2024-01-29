package com.kh.data.remote.models

data class PostsResponseItem(
    val body: String,
    val id: Int,
    val title: String,
    val userId: Int
)