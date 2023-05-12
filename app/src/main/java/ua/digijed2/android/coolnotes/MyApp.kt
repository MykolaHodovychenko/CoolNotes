package ua.digijed2.android.coolnotes

import android.app.Application
import ua.digijed2.android.coolnotes.repository.NoteRepository
import ua.digijed2.android.coolnotes.room.NotesDatabase

class MyApp : Application() {

    private val database by lazy {
        NotesDatabase.getDatabase(this)
    }

    val repository by lazy {
        NoteRepository(database.noteDao())
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
    }

    companion object {
        lateinit var instance: MyApp
            private set
    }

}