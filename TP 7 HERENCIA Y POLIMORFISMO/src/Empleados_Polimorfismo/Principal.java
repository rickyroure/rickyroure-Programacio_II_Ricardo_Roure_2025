/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empleados_polimorfismo;

import java.util.ArrayList;
import java.util.List;

public class Principal {

    public static void main(String[] args) {
        List<Empleado> empleados = new ArrayList<>();
        
        empleados.add(new EmpleadoPlanta("01/01/2025", true, "1", 
                    "Carlos Castro", "25456895", 40.0));
        empleados.add(new EmpleadoPlanta("01/03/2025", true, "2", 
                    "Marcela Toreto", "30559874", 42.0));
        empleados.add(new EmpleadoTemporal("01/04/2025", "30/09/2025",
                    "3", "Damian Depiace", "35647854", 50.0));
        empleados.add(new EmpleadoPlanta("01/02/2025", true, "4", 
                    "Marcelo Madelon", "30445789", 44.0));
        empleados.add(new EmpleadoPlanta("01/03/2025", true, "5",
                    "Patricia Bulcricich", "32889654", 48.0));
        empleados.add(new EmpleadoTemporal("01/04/2025", "30/09/2025",
                    "6", "Damian Depiace", "35647854", 52.0));
        empleados.add(new EmpleadoPlanta("01/0012025", true, "7",
                    "Piñon Fijo", "45874632", 44.0));
        empleados.add(new EmpleadoTemporal("01/05/2025", "30/09/2025",
                    "8", "Guillermo Andino", "18271468", 50.0));
    
        for (Empleado empleado : empleados) {
           System.out.println("Sueldo del Empleado: " + empleado.getNombre() +
                        ", DNI: " + empleado.getDni() + ", es: " + 
                       empleado.calcularSueldo());
        }
    
        System.out.println("\nEMPLEADOS DE PLANTA");
        for (Empleado empleado : empleados) {
            if (empleado instanceof EmpleadoPlanta empleadoPlanta){
                System.out.println(empleado.getNombre() + ", " + empleado.getDni() +
                         ", " + empleadoPlanta.getFechaIngreso() +
                         ", " + empleado.getHorasTrabajadas());
            }
        }
        System.out.println("\nEMPLEADOS TEMPORALES");
        for (Empleado empleado : empleados) {
            if (empleado instanceof EmpleadoTemporal empleadoTemporal){
                System.out.println(empleado.getNombre() + ", " + empleado.getDni() +
                       ", " + empleadoTemporal.getFechaIngreso() +
                       ", " + empleadoTemporal.getFechaFinalizacion() + 
                       ", " + empleado.getHorasTrabajadas());
            }
        }
    }
}