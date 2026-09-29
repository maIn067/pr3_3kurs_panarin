package com.bignerdranch.android.criminalintent

import android.content.Context
import java.io.File
import java.util.UUID

object CrimeRepository {

    private val crimes = mutableListOf<Crime>()

    fun getCrimes(): List<Crime> {
        return crimes
    }

    fun getCrime(id: UUID): Crime? {
        return crimes.find { it.id == id }
    }

    fun addCrime(crime: Crime) {
        crimes.add(crime)
    }

    fun getPhotoFile(context: Context, crime: Crime): File {
        return File(context.applicationContext.filesDir, crime.photoFileName)
    }
}
