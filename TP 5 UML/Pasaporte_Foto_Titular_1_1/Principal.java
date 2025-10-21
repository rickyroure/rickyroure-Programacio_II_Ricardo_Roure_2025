/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pasaporte_foto_titular_1_1;

import java.time.LocalDate;

public class Principal {

    public static void main(String[] args) {
       Titular titular = new Titular("Mateo Carreras", "26458977");
       Pasaporte pasaporte = new Pasaporte("A25444545", LocalDate.now(), 
                   ".../pas/fotos", "jpg");
       titular.setPasaporte(pasaporte);
       System.out.println("Titular: " + titular.getNombre());
       System.out.println("Pasaporte numero: "+ titular.getPasaporte().getNumero());
       pasaporte.mostrar();
    }
}
