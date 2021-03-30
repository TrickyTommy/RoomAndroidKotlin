package com.example.roomdatabaseonetoone.multipleTables.entities.relations

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation
import com.example.roomdatabaseonetoone.multipleTables.entities.Subject

//n to m relations
data class StudentWithSubjects(
    @Embedded val student: String,
    @Relation(
        parentColumn = "studentName",
        entityColumn = "subjectName",
        associateBy = Junction(StudentsSubjectCrossRef::class)
    )
    val subjects: List<Subject>

)
