/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaAcademico;

import java.util.ArrayList;
import java.util.List;

public class Profesor {


    public Profesor(String id, String cursos, String idiomas, java.util.List<SistemaAcademico.Curso> cursos1) {
        this.id = id;
        this.cursos = cursos1;
    }
    private final String id;
    private String nombre;
    private String especialidad;
    private final List<Curso> cursos;


    public String getId() {
        return id;
    }
    public String getNombre() {
        return nombre;
    }
    public String getEspecialidad() {
        return especialidad;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    public List<Curso> getCursos() {
        return cursos;
    }
    public void agregarCurso(Curso curso){
        if (curso != null && !cursos.contains(curso)){
            cursos.add(curso);
        }
        if (curso.getProfesor() != this){
            curso.setProfesor(this);
        }
    }
    public void eliminarCurso(Curso curso){
        if (curso != null && cursos.contains(curso)){
            cursos.remove(curso);
        }
        if (curso.getProfesor() == this){
            curso.setProfesor(null);
        }
    }
    public void mostrarInfo(){
        List<Curso> Cursos = this.getCursos();
        List cursosDados = new ArrayList<>();
        if (!Cursos.isEmpty()){
            for (Curso curso : Cursos) {
                cursosDados.add(curso.getNombre());
            }
        } else{
            cursosDados = null;
            }
        System.out.println("Id: " + id+ ", Nombre: " + nombre+ ", Especialidad: " +
                    especialidad+ ", Cursos asignados: " + cursosDados);
    }
}
