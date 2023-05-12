package ua.digijed2.android.coolnotes.repository

import androidx.lifecycle.LiveData
import ua.digijed2.android.coolnotes.model.Note
import ua.digijed2.android.coolnotes.room.NoteDao

class NoteRepository(private val noteDao: NoteDao) {

    val notes: LiveData<List<Note>> = noteDao.getAllNotes()

    fun addNote(note: Note) {
        noteDao.addNote(note)
    }

}