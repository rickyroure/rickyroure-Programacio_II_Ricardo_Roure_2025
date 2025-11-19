/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vehiculos_Herencia_Basico;

public class Auto extends Vehiculo {
    private final int cantidadPuertas;

    public Auto(int cantidadPuertas, String marca, String modelo) {
        super(marca, modelo);
        this.cantidadPuertas = cantidadPuertas;
    }
    
    @Override
     public String mostrarInfo(){
         return super.mostrarInfo() + ", con " + cantidadPuertas + " puertas.";
     }
}
