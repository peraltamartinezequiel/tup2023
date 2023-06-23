package ar.edu.utn.frbb.tup.persistence;

import ar.edu.utn.frbb.tup.model.Alumno;
import ar.edu.utn.frbb.tup.persistence.exception.DaoException;

public interface AlumnoDao {

    void saveAlumno(Alumno a);

    Alumno findAlumno(String apellido);

    Alumno loadAlumno(Long dni);
}
