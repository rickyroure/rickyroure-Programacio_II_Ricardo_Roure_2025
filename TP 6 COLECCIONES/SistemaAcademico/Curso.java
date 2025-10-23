/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaAcademico;

public class Curso {
    private final String codigo;
    private String nombre;
    private Profesor profesor;

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }
    public String getCodigo() {
        return codigo;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
     }
    public void setProfesor(Profesor profesor) {
        if (this.profesor == profesor){
            return;
        }
        //if (this.profesor != null){
        //    this.profesor.eliminarCurso(this);
        //}
        this.profesor = profesor;
        if (this.profesor != null && !profesor.getCursos().contains(this)){
            profesor.agregarCurso(this);
        }
    }
    public Profesor getProfesor() {
        return profesor;
    }
    public void mostrarInfo(){
        String infoProfe;
        if (this.profesor != null){
            infoProfe = profesor.getNombre();
        } else{
            infoProfe = "No asignado";
            }
        System.out.println("Codigo: " + codigo + ", Nombre: " + nombre + 
                       ", Profesor asignado: " + infoProfe);
        }

    void setProfesor(Profesor profesor) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void setProfesor(Profesor profesor) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
