package com.kh.data.mapper

import com.kh.data.remote.models.PostsResponse
import com.kh.data.remote.models.PostsResponseItem
import com.kh.domain.entity.Post

fun PostsResponse.toEntity(): List<Post> {
    return this.map {
        Post(
            title = it.title,
            body = it.body,
            id = it.id,
            userId = it.userId
        )
    }
}

fun PostsResponseItem.toEntity(): Post {
    return Post(
        title = title,
        body = body,
        id = id,
        userId = userId
    )

}