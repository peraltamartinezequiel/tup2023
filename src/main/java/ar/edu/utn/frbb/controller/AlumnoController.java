package ar.edu.utn.frbb.controller;

import org.springframework.beans.factory.annotation.Autowired;

import ar.edu.utn.frbb.tup.business.AlumnoService;
import ar.edu.utn.frbb.tup.model.Alumno;
import ar.edu.utn.frbb.tup.model.dto.AlumnoDto;

public class AlumnoController {
    @Autowired
    AlumnoService alumnoService;

    public Alumno crearAlumno(AlumnoDto alumnoDto) {
        return alumnoService.crearAlumno(alumnoDto);
    }
}
