/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarjeta_cliente_banco_1_4;
import java.time.LocalDate;

public class TarjetaDeCredito {
    private final String numero;
    private final LocalDate fechaVto;
    private Cliente cliente;
    private Banco banco;

    public TarjetaDeCredito(String numero, LocalDate fechaVto, Banco banco) {
        this.numero = numero;
        this.fechaVto = fechaVto;
        this.banco = banco;
    }
    
    public void setBanco(Banco banco){
        this.banco = banco;
    }
    
    public String getNumero() {
        return numero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente){
        this.cliente = cliente;
        if (cliente != null && cliente.getTarjeta() != this){
            cliente.setTarjeta(this);
        }
    }
    
    public void mostrarClinte(){
        System.out.println("Tarjeta: " + numero + ", Cliente: " + cliente.getNombre()
                    + ", Banco: " + banco.getNombre() + ", Vto: " + fechaVto);
    }
}