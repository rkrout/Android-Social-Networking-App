package com.example.socialnetworking.data.models

import androidx.annotation.Nullable

data class ProfileDetailsResponse(
    val id: Int,
    @Nullable
    val profileImageUrl: String?,
    val name: String,
    val bio: String,
    val totalPosts: Int,
    val totalFollowers: Int,
    val totalFollowings: Int,
    var isFollowing: Int
)