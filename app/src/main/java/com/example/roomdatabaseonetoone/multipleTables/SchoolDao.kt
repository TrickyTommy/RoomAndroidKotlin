package com.example.roomdatabaseonetoone.multipleTables

import androidx.room.*
import com.example.roomdatabaseonetoone.multipleTables.entities.Director
import com.example.roomdatabaseonetoone.multipleTables.entities.School
import com.example.roomdatabaseonetoone.multipleTables.entities.Students
import com.example.roomdatabaseonetoone.multipleTables.entities.relations.SchoolAndDirector
import com.example.roomdatabaseonetoone.multipleTables.entities.relations.SchoolWithStudents

@Dao
interface SchoolDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertSchool(school: School)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertDirector(director: Director)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertStudent(students: Students)


    @Transaction
    @Query("SELECT * FROM school WHERE schoolName=:schoolName")
    suspend fun getSchoolAndDirectorWithSchoolName(schoolName: String): List<SchoolAndDirector>
    //n to m relation
    @Transaction
    @Query("SELECT * FROM school WHERE schoolName=:schoolName ")
    suspend fun getSchoolWithStudents(schoolName: String): List<SchoolWithStudents>

}