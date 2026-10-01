package edu.iesam.evaluacion_inicial.features.domain

class SaveAlumnoUseCase(val alumnoRepository: AlumnoRepository) {

    fun execute(alumno: Alumno) {
        alumnoRepository.saveAlumno(alumno)
    }

}