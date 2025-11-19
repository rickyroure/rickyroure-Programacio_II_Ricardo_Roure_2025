/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras_geometricas;

import java.util.ArrayList;
import java.util.List;

public class Principal {

    public static void main(String[] args) {
        List<Figura> figurasGeometricas = new ArrayList<>();
        
        figurasGeometricas.add(new Circulo(3.25, "Circulo(3.25)"));
        figurasGeometricas.add(new Circulo(1.75, "Circulo(1.75)"));
        figurasGeometricas.add(new Rectangulo(6.3, 4.6, "Rectangulo(6.3, 4.6)"));
        figurasGeometricas.add(new Rectangulo(2.1, 5.4, "Rectangulo(2.1, 5.4)"));
        
        for (Figura figuraGeometrica : figurasGeometricas) {
            System.out.println(figuraGeometrica.calcularArea());
        }
    }
}
