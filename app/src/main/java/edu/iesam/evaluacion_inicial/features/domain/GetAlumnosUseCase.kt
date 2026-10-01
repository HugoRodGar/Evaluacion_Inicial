package edu.iesam.evaluacion_inicial.features.domain

class GetAlumnosUseCase(val alumnoRepository: AlumnoRepository) {

    fun execute() {
        alumnoRepository.getAlumnos()
    }

}