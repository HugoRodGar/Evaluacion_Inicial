package edu.iesam.evaluacion_inicial.features.data

import edu.iesam.evaluacion_inicial.features.domain.Alumno
import edu.iesam.evaluacion_inicial.features.domain.AlumnoRepository

class AlumnoDataRepository(val alumnoMemLocalDataSource: AlumnoMemLocalDataSource) : AlumnoRepository {

    override fun saveAlumno(alumno: Alumno) {
        alumnoMemLocalDataSource.save(alumno)
    }

    override fun deleteAlumno(dni: String) {
        alumnoMemLocalDataSource.delete(dni)
    }

}
