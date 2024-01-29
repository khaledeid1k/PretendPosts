package com.kh.data.remote

import com.kh.data.remote.models.PostsResponse
import com.kh.data.remote.models.PostsResponseItem
import retrofit2.http.GET
import retrofit2.http.Path

interface PostsApiService {
    @GET("posts")
    suspend fun getPosts():PostsResponse
    @GET("posts/{postId}")
    suspend fun getPost(@Path("postId")postId:Int): PostsResponseItem
}