package de.telma.wordcads.data.repository

import de.telma.wordcads.data.local.entity.Dictionary
import kotlinx.coroutines.flow.Flow

interface DictionariesRepository {
    fun getAllDictionaries(): Flow<List<Dictionary>>
}