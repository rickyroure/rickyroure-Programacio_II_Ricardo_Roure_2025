/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuenta_clave_titular_1_10;

import java.time.LocalDate;

public class Principal {

    public static void main(String[] args) {
        Titular franco = new Titular("Franco Molina", "33547845");
        Titular pedro = new Titular("Pedro Rubiolo", "35985321");
        CuentaBancaria caPesos2 = new CuentaBancaria("2009000000054219800022",
                    0, "Ff5892#", LocalDate.now());
        CuentaBancaria ca$2 = new CuentaBancaria("2009000000054254800022", 
                    0, "Pp9897#", LocalDate.now());
        caPesos2.setTitular(franco);
        ca$2.setTitular(pedro);
        caPesos2.mostrarCuenta();
        caPesos2.depositar(15000);
        caPesos2.mostrarCuenta();
        caPesos2.extraer(20000);
        caPesos2.extraer(10000);
        caPesos2.extraer(5000);
        pedro.mostrarClienteCuenta();
        caPesos2.depositar(50000);
        pedro.mostrarClienteCuenta();
        System.out.println(pedro.mostrarClave()); // Solo lo hice para verificar
        //que el metodo funciona
        pedro.cambiarClave("99999");
        System.out.println(pedro.mostrarClave());
        }
}
