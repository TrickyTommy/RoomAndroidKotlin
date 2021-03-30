package com.example.roomdatabaseonetoone.multipleTables.entities.relations

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation
import com.example.roomdatabaseonetoone.multipleTables.entities.Students
import com.example.roomdatabaseonetoone.multipleTables.entities.Subject

data class SubjectWithStudents(
    @Embedded val subject: Subject,
    @Relation(
        parentColumn = "subjectName",
        entityColumn = "studentName",
        associateBy = Junction(StudentsSubjectCrossRef::class)
    )
    val students: List<Students>
)
