/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package impuesto_contribuyente_calculadora_1_12;

public class Principal {

    public static void main(String[] args) {
        Contribuyente amado = new Contribuyente("Amado Boudo", "20-19456987-2");
        Impuesto automotor = new Impuesto(12000);
        automotor.setContribuyente(amado);
        Calculadora.calcular(automotor);
     }
}
