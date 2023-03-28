package com.codepath.articlesearch

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface ItemDao {
    @Query("SELECT * FROM article_table")
    fun getAll(): Flow<List<ItemEntity>>

    @Insert
    fun insertAll(articles: List<ItemEntity>)

    @Query("DELETE FROM article_table")
    fun deleteAll()
}