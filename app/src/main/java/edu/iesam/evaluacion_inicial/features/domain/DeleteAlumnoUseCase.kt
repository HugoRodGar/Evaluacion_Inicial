package edu.iesam.evaluacion_inicial.features.domain

class DeleteAlumnoUseCase(val alumnoRepository: AlumnoRepository) {

    fun execute(dni: String) {
        alumnoRepository.deleteAlumno(dni)
    }

}