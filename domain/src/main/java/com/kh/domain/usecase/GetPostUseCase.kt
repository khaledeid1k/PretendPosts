package com.kh.domain.usecase

import com.kh.domain.repo.Repository

class GetPostUseCase(private val  repository: Repository) {
    suspend operator fun invoke(postId:Int){repository.getPost(postId)}
}