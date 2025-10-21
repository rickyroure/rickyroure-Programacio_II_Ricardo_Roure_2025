/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package citamedica_paciente_profesional_1_9;
import java.time.LocalDate;
import java.time.LocalTime;

public class CitaMedica {
    private final LocalDate fecha;
    private final LocalTime hora;
    private Paciente paciente;
    private Profesional profesional;

    public CitaMedica(LocalDate fecha, LocalTime hora) {
        this.fecha = fecha;
        this.hora = hora;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public void setProfesional(Profesional profesional) {
        this.profesional = profesional;
    }
    
    public void mostrarCita(){
        System.out.println("Paciente: " + paciente.getNombre() + 
                    ", Dia: " + fecha + " , hora: " + hora +
                    ", Profesional: " + profesional.getNombre() + 
                    ", Especialidad: " + profesional.getEspecialidad());
    }
 }
