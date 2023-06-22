package ar.edu.utn.frbb.tup.controller;

import ar.edu.utn.frbb.tup.business.MateriaService;
import ar.edu.utn.frbb.tup.model.Materia;
import ar.edu.utn.frbb.tup.model.Profesor;
import ar.edu.utn.frbb.tup.model.dto.MateriaDto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("materia")
public class MateriaController {
    @Autowired
    private MateriaService materiaService;

    @GetMapping
    public List<Materia> getMaterias() {
        Materia m = new Materia("labo 1", 2, 1, new Profesor("Lucho", "Salotto", "Lic"));
        Materia m1 = new Materia("labo 2", 2, 1, new Profesor("Juan", "Perez", "Lic"));

        return Arrays.asList(m1, m);
    }
    @PostMapping("/")
    public Materia crearMateria(@RequestBody MateriaDto materiaDto) {
        return materiaService.crearMateria(materiaDto);
    }
}
