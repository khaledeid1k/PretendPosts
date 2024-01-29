package com.kh.domain.repo

import com.kh.domain.entity.Post

interface Repository {

    suspend fun getPosts(): List<Post>
    suspend fun getPost(postId:Int):Post
}