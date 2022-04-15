package com.ramonmunoz.unionviera.feature_notes.data.data_source

import androidx.room.*
import com.ramonmunoz.unionviera.feature_notes.domain.model.Note
import kotlinx.coroutines.flow.Flow

@Dao
interface NoteDao {

    /// Get a list of Note
    @Query("SELECT * FROM note")
    fun getNotes(): Flow<List<Note>>

    /// Get one note by id
    @Query("SELECT * FROM note WHERE id = :id")
    suspend fun getNoteById(id: Int): Note?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertNote(note: Note)

    @Delete
    suspend fun deleteNote(note: Note)
}