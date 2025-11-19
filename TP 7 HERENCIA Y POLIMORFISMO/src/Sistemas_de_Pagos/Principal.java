/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistemas_de_Pagos;

public class Principal {

    public static void main(String[] args) {
        Pagable tarjeta = (Pagable) new TarjetadeCredito("4555852174549685");
        Pagable trans = new Transferencia("2001000005866598500000");
        Pagable efectivo = new Efectivo();
        
        procesarPago(tarjeta, 5000.00);
        procesarPago(trans, 23000.0);
        procesarPago(efectivo, 15000.0);
    }
    public static void procesarPago(Pagable medio, double monto){
            medio.pagar(monto);
        }
}
