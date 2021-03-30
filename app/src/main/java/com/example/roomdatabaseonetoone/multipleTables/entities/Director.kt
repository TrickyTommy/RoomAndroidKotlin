package com.example.roomdatabaseonetoone.multipleTables.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Director (
    @PrimaryKey
    val directorName: String,
    val schoolName: String
        ){
}