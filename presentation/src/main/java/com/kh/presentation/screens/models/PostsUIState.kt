package com.kh.presentation.screens.models

import android.os.Parcelable
import com.kh.domain.entity.Post
import com.kh.presentation.base.BaseErrorUiState
import kotlinx.parcelize.Parcelize


data class PostsUIState(
    val posts: List<PostUIState> = emptyList(),
    val isLoading: Boolean = false,
    val error: BaseErrorUiState? = null,
)

@Parcelize
data class PostUIState(
    val body: String = "",
    val id: Int = 0,
    val title: String = "",
    val userId: Int = 0,
) : Parcelable

fun Post.toState(): PostUIState {
    return PostUIState(
        body = body,
        id = id,
        title = title,
        userId = userId,
    )
}