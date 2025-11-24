/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e_commerce;

public class PayPal implements PagoConDescuento {
    private String email;
    private double tasaDescuento;

    public PayPal(String email) {
        this.email = email;
        this.tasaDescuento = 0.0;
    }

    @Override
    public void procesarPago(double monto) {
        double montoDescontado = monto - monto * this.tasaDescuento; 
        System.out.println("Procesando pago de $" + montoDescontado + " con PayPal: " + email);
    }

    @Override   
    public void aplicarDescuento(double descuento) {
        this.tasaDescuento = descuento/100;
        System.out.println("Aplicando descuento de " + descuento + " % en PayPal");
    }
    
    
}
