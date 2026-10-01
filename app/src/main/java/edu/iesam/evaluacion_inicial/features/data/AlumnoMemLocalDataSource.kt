package edu.iesam.evaluacion_inicial.features.data

import edu.iesam.evaluacion_inicial.features.domain.Alumno


class AlumnoMemLocalDataSource {

    val storage = ArrayList<Alumno>()

    fun save(alumno : Alumno) {
        storage.add(alumno)
    }
    fun delete(dni: String) {
        storage.removeIf { alumno: Alumno -> alumno.Dni == dni }
    }

    fun findAll(): ArrayList<Alumno> {
        return storage
    }

}