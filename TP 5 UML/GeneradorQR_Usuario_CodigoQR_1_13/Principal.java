/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package generadorqr_usuario_codigoqr_1_13;

public class Principal {

    public static void main(String[] args) {
        Usuario javier = new Usuario("Javier Limei", "vllc@gmail.com");
        GeneradorQR.generar("www.vllc.com.ar", javier);
    }    
}
