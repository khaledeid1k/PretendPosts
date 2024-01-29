package com.kh.data.repo

import com.kh.data.mapper.toEntity
import com.kh.data.remote.RemoteDataSource
import com.kh.domain.entity.Post
import com.kh.domain.repo.Repository

class RepositoryIm(private val remoteDataSource: RemoteDataSource): Repository {
    override suspend fun getPosts(): List<Post> {
      return  remoteDataSource.getPosts().toEntity()
    }

    override suspend fun getPost(postId: Int): Post {
        return   remoteDataSource.getPost(postId).toEntity()
    }

}