/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package generadorqr_usuario_codigoqr_1_13;

public class GeneradorQR {
    
    public static void generar(String valor, Usuario usuario){
        CodigoQR qr1 = new CodigoQR(valor);
        qr1.setUsuario(usuario);
    }
}