/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e_commerce;

public class Principal {

    public static void main(String[] args) {
         
        System.out.println("=== SISTEMA DE E-COMMERCE ===");
        
        // Crear productos
        Producto notebook1 = new Producto("Laptop", 1000.0);
        Producto mouse1 = new Producto("Mouse", 25.0);
        
        // Crear cliente
        Cliente juan = new Cliente("Juan", "juan@email.com");
        
        // Crear pedido y asociarlo al cliente
        Pedido pedidoJuan = new Pedido();
        pedidoJuan.setCliente(juan);
        pedidoJuan.agregarProducto(notebook1);
        pedidoJuan.agregarProducto(mouse1);
        
        System.out.println("Total del pedido: $" + pedidoJuan.calcularTotal());
        
        // Cambiar estado del pedido (esto notificará automáticamente al cliente)
        pedidoJuan.cambiarEstado("Enviado");
        
        // Procesar pago con tarjeta (comentar o descomentar segun como se haga el pago)
        Pago tarjeta = new TarjetaCredito("1234-5678-9012-3456");
        tarjeta.procesarPago(pedidoJuan.calcularTotal());
        
        // Procesar pago con PayPal (comentar o descomentar segun como se haga el pago)
        PagoConDescuento paypal = new PayPal("juan@email.com");
        paypal.aplicarDescuento(10.0);
        paypal.procesarPago(pedidoJuan.calcularTotal());
    }
}
