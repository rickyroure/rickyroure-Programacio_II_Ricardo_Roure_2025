/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras_geometricas;

public class Circulo extends Figura {
    private final double radio;

    public Circulo(double radio, String nombre) {
        super(nombre);
        this.radio = radio;
    }
    @Override
    public double calcularArea() {
        return Math.PI * radio * radio; 
    }
}