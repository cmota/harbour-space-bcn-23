package com.harbourspace.unsplash.ui.repository

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.harbourspace.unsplash.ui.data.UnsplashItem

@Dao
interface UnsplashDAO {

    @Query("SELECT * FROM UnsplashItem")
    fun getAllImages(): LiveData<List<UnsplashItem>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insertImage(image: UnsplashItem)
}