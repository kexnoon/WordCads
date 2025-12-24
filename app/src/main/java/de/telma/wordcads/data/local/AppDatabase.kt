package de.telma.wordcads.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import de.telma.wordcads.data.local.dao.DictionaryDao
import de.telma.wordcads.data.local.entity.Dictionary

@Database(entities = [Dictionary::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun dictionaryDao(): DictionaryDao
}
