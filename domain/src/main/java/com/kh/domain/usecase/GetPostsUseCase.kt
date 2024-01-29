package com.kh.domain.usecase

import com.kh.domain.entity.Post
import com.kh.domain.repo.Repository

class GetPostsUseCase(private val  repository: Repository) {
    suspend operator fun invoke(): List<Post> { return repository.getPosts()}

}