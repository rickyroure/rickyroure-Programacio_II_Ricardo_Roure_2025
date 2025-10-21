/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pasaporte_foto_titular_1_1;
import java.time.LocalDate;

public class Pasaporte {
    private final String numero;
    private LocalDate fechaEmision;
    private Titular titular;
    private final foto foto;
    
    public Pasaporte(String numero, LocalDate fechaEmision, String urlFoto, 
                String formato) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.fechaEmision = fechaEmision;
        this.foto = new foto(urlFoto, formato);
    }
    
    public void setTitular(Titular titular){
        this.titular = titular;
        if (titular != null && titular.getPasaporte()!= this){
            titular.setPasaporte(this);
        }
    }
    public Titular getTitular(){
        return titular;
    }
    public String getNumero() {
        return numero;
    }
    public void mostrar(){
        System.out.println("Pasaporte: " + 
                fechaEmision+ numero + ", Fecha de emision: " + ", Url foto:" + foto.mostrarFoto());
    }

    private static class foto {

        public foto(String urlFoto, String formato) {
        }

        private String mostrarFoto() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }


    }
}
