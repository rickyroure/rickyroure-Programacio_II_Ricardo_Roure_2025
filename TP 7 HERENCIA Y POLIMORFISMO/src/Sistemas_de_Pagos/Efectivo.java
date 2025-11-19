/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Sistemas_de_Pagos;

public class Efectivo implements Pagable {
         
    /**
     *
     * @param monto
     */
    @Override
    public void pagar(double monto) {
        System.out.println("Pagando en efectivo un monto de $ " + monto);
    }
}
