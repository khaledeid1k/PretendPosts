package com.kh.data.remote

import com.kh.data.remote.models.PostsResponse
import com.kh.data.remote.models.PostsResponseItem

interface RemoteDataSource {

    suspend fun getPosts(): PostsResponse
    suspend fun getPost(postId:Int): PostsResponseItem
}