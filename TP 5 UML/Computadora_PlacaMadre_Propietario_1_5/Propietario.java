/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package computadora_placamadre_propietario_1_5;

public class Propietario {
    private final String nombre;
    private Computadora computaora;

    public Propietario(String nombre, String dni) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public Computadora getComputaora() {
        return computaora;
    }
    
    public void setComputadora(Computadora computadora){
        this.computaora = computadora;
        if (computadora != null && computadora.getPropietario() != this){
            computadora.setPropietrio(this);
        }
    }    
    
    public void mostrar(){
        System.out.println("Propietario: " + nombre + ", Computadora marca: " 
                    + computaora.getMarca() + ", Serie: " + computaora.getNumeroSerie());
    }
}