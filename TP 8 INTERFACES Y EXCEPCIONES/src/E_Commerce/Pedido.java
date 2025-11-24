/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e_commerce;
import java.util.ArrayList;
import java.util.List;


public class Pedido implements Pagable {
    private List<Producto> productos;
    private String estado;
    private Cliente cliente;

    public Pedido() {
        this.productos = new ArrayList<>();
        this.estado = "Pendiente";
    }
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    @Override
    public double calcularTotal() {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.calcularTotal();
        }
        return total;
    }

    public void cambiarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        // Notificar al cliente del cambio de estado
        if (cliente != null) {
            cliente.notificar("El estado de su pedido cambió a: " + nuevoEstado);
        }
    }

    public String getEstado() {
        return estado;
    }
}
