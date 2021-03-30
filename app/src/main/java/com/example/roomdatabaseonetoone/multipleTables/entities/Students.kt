package com.example.roomdatabaseonetoone.multipleTables.entities

import androidx.room.PrimaryKey

data class Students(
    @PrimaryKey(autoGenerate = false)
    val studentName: String,
    val semester: Int,
    val schoolName: String

) {
}