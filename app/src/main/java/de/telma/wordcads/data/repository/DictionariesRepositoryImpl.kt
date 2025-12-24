package de.telma.wordcads.data.repository

import de.telma.wordcads.data.local.dao.DictionaryDao
import de.telma.wordcads.data.local.entity.Dictionary
import kotlinx.coroutines.flow.Flow

class DictionariesRepositoryImpl(
    private val dictionaryDao: DictionaryDao
) : DictionariesRepository {

    override fun getAllDictionaries(): Flow<List<Dictionary>> {
        return dictionaryDao.getAllDictionaries()
    }
}
