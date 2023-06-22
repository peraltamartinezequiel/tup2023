package ar.edu.utn.frbb.tup.model.dto;

public class MateriaDto {
    String nombre;
    int anio;
    int cuatrimestre;
    int idProfesor;
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getAnio() {
        return anio;
    }
    public void setAnio(int anio) {
        this.anio = anio;
    }
    public int getCuatrimestre() {
        return cuatrimestre;
    }
    public void setCuatrimestre(int cuatrimestre) {
        this.cuatrimestre = cuatrimestre;
    }
    public int getIdProfesor() {
        return idProfesor;
    }
    public void setIdProfesor(int idProfesor) {
        this.idProfesor = idProfesor;
    }
}
