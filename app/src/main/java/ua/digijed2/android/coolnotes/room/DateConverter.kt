package ua.digijed2.android.coolnotes.room

import androidx.room.TypeConverter
import java.util.*

class DateConverter {
    @TypeConverter
    fun fromTimestamp(value: Long?) = value?.let { Date(it) }
    @TypeConverter
    fun toTimestamp(date: Date?) = date?.time
}