package ar.edu.utn.frbb.tup.business;

import ar.edu.utn.frbb.tup.model.Profesor;
import ar.edu.utn.frbb.tup.model.dto.ProfesorDto;

public interface ProfesorService {
    void crearProfesor(Profesor inputData);

    Profesor crearProfesor(ProfesorDto profesorDto);
}
