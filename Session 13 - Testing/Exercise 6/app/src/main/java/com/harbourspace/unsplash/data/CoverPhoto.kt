package com.harbourspace.unsplash.data

import android.os.Parcelable
import androidx.room.Entity
import kotlinx.parcelize.Parcelize

@Entity
@Parcelize
data class CoverPhoto(
    val blur_hash: String,
    val color: String,
    val description: String?,
    val height: Int,
    val id: String,
    val liked_by_user: Boolean,
    val likes: Int,
    val links: Links,
    val urls: Urls,
    val user: User,
    val width: Int
): Parcelable