package com.example.roomdatabaseonetoone.multipleTables.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Students(
    @PrimaryKey(autoGenerate = false)
    val studentName: String,
    val semester: Int,
    val schoolName: String

) {
}