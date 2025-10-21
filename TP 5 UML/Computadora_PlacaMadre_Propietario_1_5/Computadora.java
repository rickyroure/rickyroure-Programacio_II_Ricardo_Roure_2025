/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package computadora_placamadre_propietario_1_5;

public class Computadora {
    private String marca;
    private String numeroSerie;
    private Propietario propietario;
    private PlacaMadre placaMadre;

    public Computadora(String marca, String numeroSerie, String modeloPlaca, String chipset) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        this.placaMadre = new PlacaMadre(modeloPlaca, chipset);
    }

    public String getMarca() {
        return marca;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }
    
    public Propietario getPropietario() {
        return propietario;
    }
    
    public void setPropietrio(Propietario propietario){
        this.propietario = propietario;
        if (propietario != null && propietario.getComputaora() != this){
            propietario.setComputadora(this);
        }
    }
    
    public void mostrarComputadora(){
        System.out.println("Computadora marca: " + marca + ", Serie: " + numeroSerie +
                    ", Placa Madre modelo: " + placaMadre.getModelo() + 
                    ", Propietario: " + propietario.getNombre());
    }   
}