package de.telma.wordcards.data.repository

import de.telma.wordcards.data.local.entity.Dictionary
import kotlinx.coroutines.flow.Flow

interface DictionariesRepository {
    fun getAllDictionaries(): Flow<List<Dictionary>>
}