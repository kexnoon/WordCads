package de.telma.wordcads.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "dictionaries")
data class Dictionary(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val name: String
)
