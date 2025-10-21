/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package citamedica_paciente_profesional_1_9;

import java.time.LocalDate;
import java.time.LocalTime;

public class Principal {

    public static void main(String[] args) {
        Profesional chapatin = new Profesional("Jorge Chapatin", "Clinica Medica");
        Profesional rimolo = new Profesional("Silvia Rimolo", "Otorrinolaringologia");
        Paciente jorge = new Paciente("Jorge Cuadrado", "CisPren");
        Paciente lalo = new Paciente("Lalo Freyle", "Camioneros");
        CitaMedica cita1 = new CitaMedica(LocalDate.of(2025, 9, 14), LocalTime.of(10, 40, 0));
        CitaMedica cita2 = new CitaMedica(LocalDate.of(2025, 9, 21), LocalTime.of(8, 15, 0));
        cita1.setPaciente(jorge);
        cita2.setPaciente(lalo);
        cita1.setProfesional(chapatin);
        cita2.setProfesional(rimolo);
        cita1.mostrarCita();
        cita2.mostrarCita();
    }
}    
