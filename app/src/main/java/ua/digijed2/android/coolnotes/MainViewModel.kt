package ua.digijed2.android.coolnotes

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import ua.digijed2.android.coolnotes.model.Note
import java.lang.Thread.sleep

class MainViewModel : ViewModel() {

    private val repository = MyApp.instance.repository

    val notes = MutableLiveData<Int>()

    fun counter() {
        Thread {
            for (i in 1..10000) {
                sleep(100)
                notes.postValue(i)
            }
        }.start()
    }

}