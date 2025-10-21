/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pasaporte_foto_titular_1_1;

public class Titular {
    private final String nombre;
    private final String dni;
    private Pasaporte pasaporte;

    public Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

     public void setPasaporte(Pasaporte pasaporte){
        this.pasaporte = pasaporte;
        if (pasaporte != null && pasaporte.getTitular() != this){
            pasaporte.setTitular(this);
        }
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }
    
    public Pasaporte getPasaporte(){
        return pasaporte;
    }
}
