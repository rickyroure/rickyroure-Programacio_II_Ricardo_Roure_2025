/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package computadora_placamadre_propietario_1_5;

public class Principal {

    public static void main(String[] args) {
        Propietario marcos = new Propietario("Marcos Kremer", "28963258");
        Propietario juan = new Propietario("Juan Cruz Mallia", "30854712");
        Computadora note1 = new Computadora("HP", "AFR12542252", "GIGABYTE B760M DS3H AX:", "AMD X670E");
        Computadora note2 = new Computadora("HP", "AFR12542253", "GIGABYTE B760M DS3H AX:", "Intel HM670");
        note1.setPropietrio(marcos);
        note2.setPropietrio(juan);
        note1.mostrarComputadora();
        note2.mostrarComputadora();
        marcos.mostrar();
        juan.mostrar();
        
        
    }
}
