/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empleados_polimorfismo;

public abstract class Empleado {
    private final String nombre;
    private final String dni;
    private final double horasTrabajadas;

    public Empleado(String legajo, String nombre, String dni, double 
                horasTrabajadas) {
        this.nombre = nombre;
        this.dni = dni;
        this.horasTrabajadas = horasTrabajadas;
    }

    public abstract double calcularSueldo();

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }
}
