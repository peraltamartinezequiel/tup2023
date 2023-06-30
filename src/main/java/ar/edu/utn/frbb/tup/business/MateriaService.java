package ar.edu.utn.frbb.tup.business;

import ar.edu.utn.frbb.tup.model.Materia;
import ar.edu.utn.frbb.tup.model.dto.MateriaDto;

import java.util.List;

public interface MateriaService {
    void crearMateria(Materia inputData);

    List<Materia> getAllMaterias();

    Materia crearMateria(MateriaDto materiaDto);

    Materia buscarMateria(int materiaId);
}
