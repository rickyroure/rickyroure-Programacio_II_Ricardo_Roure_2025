/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conversion_cadena_numero;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Conversion de Cadena a Numero ===");
        System.out.print("Ingrese un numero entero: ");
        String texto = scanner.nextLine();
        
        try {
            int numero = Integer.parseInt(texto);
            System.out.println("El numero es: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("Error: No se pudo convertir '" + texto + "' a numero entero");
        }
    }
    
}
