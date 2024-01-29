package com.kh.presentation.screens.posts

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.kh.presentation.R
import com.kh.presentation.base.BaseFragment
import com.kh.presentation.databinding.FragmentPostsBinding
import com.kh.presentation.screens.models.PostUIState
import com.kh.presentation.viewModel.PostsViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class PostsFragment :BaseFragment<FragmentPostsBinding>(),
    PostsAdapter.PostsListener {
    override val layoutIdFragment=R.layout.fragment_posts
    override val viewModel: PostsViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {

            adapter= PostsAdapter(this@PostsFragment)
        }
    }

    override fun onClickPost() {
        findNavController().navigate(
            PostsFragmentDirections.actionPostsFragmentToPostFragment()
        )
    }

}