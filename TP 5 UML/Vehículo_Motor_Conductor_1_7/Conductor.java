/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vehículo_Motor_Conductor_1_7;

public class Conductor {

    public Conductor(java.lang.String nombre) {
        this.nombre = nombre;
    }
    private final String nombre;
    private Vehiculo vehiculo;

    Conductor(String lucio_Cinti, String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }




    public String getNombre() {
        return nombre;
    }

    
    public void setVehiculo(Vehiculo vehiculo){
        this.vehiculo = vehiculo;
        if (vehiculo != null && vehiculo.getConductor() != this){
            vehiculo.setConductor(this);
        }
    }
    
    public void mostrarVehiculo(){
        System.out.println("El conductor " + nombre + ", tiene asignado el vehiculo " +
                    vehiculo.getModelo() + " patente " + vehiculo.getPatente());
    }

    Vehiculo getVehiculo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}