/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pasaporte_Foto_Titular_1_1;

public class Foto {
    private final String url;
    private final String formato;

    public Foto(String url, String formato) {
        this.url = url;
        this.formato = formato;
    }
    
    public String mostrarFoto(){
        return url + "." + formato;
    }
}
