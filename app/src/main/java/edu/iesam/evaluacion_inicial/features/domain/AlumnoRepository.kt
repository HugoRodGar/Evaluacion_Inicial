package edu.iesam.evaluacion_inicial.features.domain


interface AlumnoRepository {

    fun saveAlumno(alumno: Alumno)
    fun deleteAlumno(dni: String)

    fun getAlumnos(): ArrayList<Alumno>

}