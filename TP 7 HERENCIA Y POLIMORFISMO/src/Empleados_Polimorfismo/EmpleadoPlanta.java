/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empleados_polimorfismo;

public class EmpleadoPlanta extends Empleado {
    private final double VALOR_HORA = 1350;
    private final String fechaIngreso;

    public EmpleadoPlanta(String fechaIngreso, boolean permanente, String legajo,
                String nombre, String dni, double horasTrabajadas) {
        super(legajo, nombre, dni, horasTrabajadas);
        this.fechaIngreso = fechaIngreso;
    }
    
    @Override
    public double calcularSueldo() {
        return VALOR_HORA * getHorasTrabajadas();
    }

    public double getVALOR_HORA() {
        return VALOR_HORA;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }
}
