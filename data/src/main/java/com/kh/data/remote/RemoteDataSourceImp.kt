package com.kh.data.remote

class RemoteDataSourceImp (private val postsApiService:PostsApiService):
    RemoteDataSource {
    override suspend fun getPosts()=postsApiService.getPosts()


    override suspend fun getPost(postId: Int)= postsApiService.getPost(postId)



}