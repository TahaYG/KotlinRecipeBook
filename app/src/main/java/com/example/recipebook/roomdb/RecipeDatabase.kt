package com.example.recipebook.roomdb

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.recipebook.model.Recipe

@Database(entities = [Recipe::class], version = 1)
abstract class RecipeDatabase : RoomDatabase() {
    abstract fun RecipeDAO() : RecipeDAO
}