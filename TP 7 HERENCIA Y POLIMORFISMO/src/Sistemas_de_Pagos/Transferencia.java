/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistemas_de_Pagos;

public class Transferencia implements Pagable{
    private final String cuentaOrigen;
    
    public Transferencia(String cuentaOrigen) {
        this.cuentaOrigen = cuentaOrigen;
    }
    @Override
    public void pagar(double monto) {
        String ultimosDigitos = cuentaOrigen.substring
            (cuentaOrigen.length() - 10);
        System.out.println("Pago por transferencia desde cuenta "
                    + "N ************ " + ultimosDigitos + 
                    ", por un monto de $ " + monto);
    }
}