/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reserva_cliente_mesa_1_6;
import java.time.LocalDate;
import java.time.LocalTime;

public class Principal {

    public static void main(String[] args) {
        Mesa mesa2 = new Mesa(2, 2);
        Mesa mesa4 = new Mesa(4, 4);
        Cliente joel = new Cliente("Joel Sclavi", "54112548659874");
        Cliente guido = new Cliente("Guido Petti", "54112548662588");
        Reserva r1 = new Reserva(LocalDate.of(2025,9,12), LocalTime.of(21, 30, 00), mesa4);
        r1.setCliente(joel);
        r1.mostrarReserva();
        Reserva r2 = new Reserva(LocalDate.of(2025,9,13), LocalTime.of(22, 30, 00), mesa2);
        r2.setCliente(guido);
        r2.mostrarReserva();
        
    }
}
