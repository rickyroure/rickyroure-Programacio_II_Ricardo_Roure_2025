/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaStock;

import java.util.ArrayList;
import java.util.List;

public class Inventario {
    
    private final List<Producto> productos = new ArrayList<>();
    
    
    public void listarProductos(){
        System.out.println("Listado de productos\n");
        for (Producto producto : productos) {
            producto.mostrarInfo();
        }
    }
    
    public Producto buscarProductoPorId(String id){
        int i = 0;
        Producto productoBuscado = null;
        while (i < productos.size() && !this.productos.get(i).getId().equals(id)){
            i ++;
        }
        if (i < productos.size()){
            productoBuscado = this.productos.get(i);
            }
        return productoBuscado;
    }
    
    public void eliminarProducto(String id){
        Producto productoAEliminar = buscarProductoPorId(id);
        if (productoAEliminar != null){
            productos.remove(productoAEliminar);
        }else{
            System.out.println("Producto a eliminar no encontrado");
        }
    }
    
    public void actualizarStock(String id, int cantidad){
        Producto productoAActualizar = buscarProductoPorId(id);
        if (productoAActualizar != null){
            productoAActualizar.setCantidad(cantidad);
        }else{
            System.out.println("Producto a actualizar no encontrado");
        }
    }
    
    public List<Producto> filtrarPorCategoria(CategoriaProducto categoria){
        List<Producto> productosPorCategoria = new ArrayList<>();
        for (Producto producto : productos) {
            if (producto.getCategoria() == categoria){
                productosPorCategoria.add(producto);
            }
        }
        return productosPorCategoria;
    }
    
    public int obtenerStockTotal(){
        int stockTotal = 0;
        for (Producto producto : productos) {
            stockTotal += producto.getCantidad();
        }
        return stockTotal;
    }
    
    private int maximoStock(){
        int stockMaximo = -1;
        for (Producto producto : productos) {
            if (producto.getCantidad() > stockMaximo){
                stockMaximo = producto.getCantidad();
            }
        }
        return stockMaximo;
    }
    
    public List<Producto> obtenerProductoConMayorStock(){
        List<Producto> prodMaxStock = new ArrayList<>();
        int mayorStock = maximoStock();
        for (Producto producto : productos) {
            if (producto.getCantidad() == mayorStock){
                prodMaxStock.add(producto);
            }
        }
        return prodMaxStock;
    }
    
    public void filtrarProductosPorPrecio(double min, double max){
        System.out.println("\nProductos con precios entre " + min + " y " + max);
        for (Producto producto : productos) {
            if (producto.getPrecio() >= min && producto.getPrecio() <= max){
                producto.mostrarInfo();
            }
        }
    }


} 

       
    
    
    
    
