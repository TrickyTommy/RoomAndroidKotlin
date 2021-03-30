package com.example.roomdatabaseonetoone.multipleTables.entities.relations

import androidx.room.Embedded
import androidx.room.Relation
import com.example.roomdatabaseonetoone.multipleTables.entities.Director
import com.example.roomdatabaseonetoone.multipleTables.entities.School

//1 to 1 relations
data class SchoolAndDirector(
    @Embedded val school: School,
    @Relation(
        parentColumn = "schoolName",
        entityColumn = "schoolName"
    )
    val director: Director
) {
}