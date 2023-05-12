package ua.digijed2.android.coolnotes.room

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import ua.digijed2.android.coolnotes.model.Note

@Dao
interface NoteDao {

    @Query("SELECT * FROM notes")
    fun getAllNotes() : LiveData<List<Note>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun addNote(note: Note)
}