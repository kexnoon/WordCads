package de.telma.wordcards.di

import androidx.room.Room
import de.telma.wordcards.data.local.AppDatabase
import de.telma.wordcards.data.repository.DictionariesRepositoryImpl
import de.telma.wordcards.data.repository.DictionariesRepository
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

val mainModule = module {
    single {
        Room.databaseBuilder(
            androidContext(),
            AppDatabase::class.java,
            "wordcards_database"
        ).build()
    }

    single { get<AppDatabase>().dictionaryDao() }

    single<DictionariesRepository> { DictionariesRepositoryImpl(get()) }
}
