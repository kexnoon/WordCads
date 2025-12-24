package de.telma.wordcads.di

import androidx.room.Room
import de.telma.wordcads.data.local.AppDatabase
import de.telma.wordcads.data.repository.DictionariesRepositoryImpl
import de.telma.wordcads.data.repository.DictionariesRepository
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

val mainModule = module {
    single {
        Room.databaseBuilder(
            androidContext(),
            AppDatabase::class.java,
            "wordcads_database"
        ).build()
    }

    single { get<AppDatabase>().dictionaryDao() }

    single<DictionariesRepository> { DictionariesRepositoryImpl(get()) }
}
