package edu.iesam.evaluacion_inicial.features.domain

interface AlumnoRepository {

    fun SaveAlumno(alumno : Alumno)
    fun DeleteAlumno(dni: String)

}