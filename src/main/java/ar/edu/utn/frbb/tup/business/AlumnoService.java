package ar.edu.utn.frbb.tup.business;

import ar.edu.utn.frbb.controller.AlumnoDto;
import ar.edu.utn.frbb.tup.model.Alumno;
import ar.edu.utn.frbb.tup.model.dto.AlumnoDto;
import ar.edu.utn.frbb.tup.model.exception.CorrelatividadesNoAprobadasException;
import ar.edu.utn.frbb.tup.model.exception.EstadoIncorrectoException;

public interface AlumnoService {
    void aprobarAsignatura(int materiaId, int nota, long dni) throws EstadoIncorrectoException, CorrelatividadesNoAprobadasException;

<<<<<<< HEAD
    Alumno crearAlumno(AlumnoDto alumno);
=======
    void crearAlumno(Alumno alumno);

    Alumno crearAlumno(AlumnoDto alumnoDto);
>>>>>>> b009bb069c8c6615f6fe2a719b5e478ab093e6d8
}
