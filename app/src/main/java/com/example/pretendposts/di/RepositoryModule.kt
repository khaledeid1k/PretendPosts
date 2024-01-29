package com.example.pretendposts.di

import com.kh.data.remote.RemoteDataSource
import com.kh.data.repo.RepositoryIm
import com.kh.domain.repo.Repository
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {
    @Provides
    fun provideRepository(remoteDataSource: RemoteDataSource): Repository {
        return RepositoryIm(remoteDataSource)
    }
}
