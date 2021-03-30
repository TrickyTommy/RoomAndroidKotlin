package com.example.roomdatabaseonetoone.multipleTables.entities.relations

import androidx.room.Embedded
import androidx.room.Relation
import com.example.roomdatabaseonetoone.multipleTables.entities.School
import com.example.roomdatabaseonetoone.multipleTables.entities.Students
//n to m relation
data class SchoolWithStudents(
    @Embedded val school: School,
    @Relation(
        parentColumn = "schoolName",
        entityColumn = "schoolName"
    )
    val students: List<Students>
) {
}