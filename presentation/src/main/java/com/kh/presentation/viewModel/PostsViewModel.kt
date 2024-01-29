package com.kh.presentation.viewModel

import androidx.lifecycle.viewModelScope
import com.kh.domain.usecase.GetPostsUseCase
import com.kh.presentation.base.BaseErrorUiState
import com.kh.presentation.base.BaseViewModel
import com.kh.presentation.screens.models.PostUIState
import com.kh.presentation.screens.models.PostsUIState
import com.kh.presentation.screens.models.toState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class PostsViewModel @Inject constructor (private val getPostsUseCase: GetPostsUseCase):BaseViewModel<PostsUIState>(PostsUIState()) {
    private val _posts= MutableStateFlow(PostsUIState())
    val posts: StateFlow<PostsUIState> = _posts

    init {
        getPosts()
    }

    private fun getPosts() {
        viewModelScope.launch {
            _posts.update { it.copy(isLoading = true, error = null)  }
            tryToExecute(
                {
                getPostsUseCase().map {
                    it.toState()
                }
                },
                ::onSearchJobSuccess,
                ::onError
            )
            getPostsUseCase()
        }

    }
    private fun onSearchJobSuccess(posts: List<PostUIState>) {
        _state.update { it.copy( posts= posts, isLoading = false, error = null) }
    }

    private fun onError(error: BaseErrorUiState) {
        _state.update { it.copy(error = error, isLoading = false) }
    }
}