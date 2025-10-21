/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vehículo_Motor_Conductor_1_7;

public class Principal {

    public static void main(String[] args) {
        Motor m1 = new Motor("Diesel 4 cilindros", "45254D213254");
        Motor m2 = new Motor("Nafta 4 cilindros", "854745J554245");
        Conductor lucio = new Conductor("Lucio Cinti", "32545887");
        Conductor santiago = new Conductor("Santiago Chocobares", "33254698");
        Vehiculo fordA = new Vehiculo("AH606PE", "Territory", m2);
        Vehiculo citroen = new Vehiculo("SJS926", "Picasso", m1);
        fordA.setConductor(lucio);
        citroen.setConductor(santiago);
        fordA.mostrarVehiculo();
        citroen.mostrarVehiculo();
        lucio.mostrarVehiculo();
        santiago.mostrarVehiculo();
    }
}