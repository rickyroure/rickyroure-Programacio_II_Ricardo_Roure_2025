/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistemas_de_Pagos;

public class TarjetadeCredito implements Pagable{
    private final String numeroTarjeta;
    
    public TarjetadeCredito(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }
    @Override
    public void pagar(double monto) {
        String ultimosDigitos = numeroTarjeta.substring
            (numeroTarjeta.length() - 4);
        System.out.println("Pago efectuado con tarjeta Nª ************" +
                    ultimosDigitos +
                    ", por un monto de $ " + monto);
    }
}