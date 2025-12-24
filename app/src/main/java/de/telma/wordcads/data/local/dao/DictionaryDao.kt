package de.telma.wordcads.data.local.dao

import androidx.room.Dao
import androidx.room.Query
import de.telma.wordcads.data.local.entity.Dictionary
import kotlinx.coroutines.flow.Flow

@Dao
interface DictionaryDao {
    @Query("SELECT * FROM dictionaries")
    fun getAllDictionaries(): Flow<List<Dictionary>>
}
