package com.example.pretendposts.di

import com.kh.domain.repo.Repository
import com.kh.domain.usecase.GetPostUseCase
import com.kh.domain.usecase.GetPostsUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class UseCaseModule {
    @Provides
    fun providePostsUseCase(repository: Repository): GetPostsUseCase {
        return GetPostsUseCase(repository)
    }
    @Provides
    fun providePostUseCase(repository: Repository): GetPostUseCase {
        return GetPostUseCase(repository)
    }
}