package de.telma.wordcards.data.repository

import de.telma.wordcards.data.local.dao.DictionaryDao
import de.telma.wordcards.data.local.entity.Dictionary
import kotlinx.coroutines.flow.Flow

class DictionariesRepositoryImpl(
    private val dictionaryDao: DictionaryDao
) : DictionariesRepository {

    override fun getAllDictionaries(): Flow<List<Dictionary>> {
        return dictionaryDao.getAllDictionaries()
    }
}
