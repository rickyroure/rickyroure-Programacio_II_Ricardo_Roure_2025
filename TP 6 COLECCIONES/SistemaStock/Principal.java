/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaStock;

import java.util.List;

public class Principal {

    public static void main(String[] args) {
        
        // Creamos los productos
        Producto pantalon = new Producto("1", "Pantalon de Vestir", CategoriaProducto.ROPA);
        Producto camisa = new Producto("2", "Camisa de Vestir lisa", 18000.0, 124, CategoriaProducto.ROPA);
        Producto saco = new Producto("3", "Saco Sport", CategoriaProducto.ROPA);
        Producto fideo = new Producto("4", "Fideo sopero", 1450.00, 150, CategoriaProducto.ALIMENTOS);
        Producto arroz = new Producto("5", "Arroz", 2300.00, 250, CategoriaProducto.ALIMENTOS);
        Producto gaseosa = new Producto("6", "Coca Cola 2 l.", 2800.00, 400,  CategoriaProducto.ALIMENTOS);
        Producto batidora = new Producto("7", "Batidora", 26500.00, 20,  CategoriaProducto.HOGAR);
        Producto micro = new Producto("8", "Microhondas BGH", 65000.00, 15,  CategoriaProducto.HOGAR);
        Producto heladera = new Producto("9", "Heladera NoFrost", 110000.00, 10,  CategoriaProducto.HOGAR);
        Producto  mouse = new Producto("11", "Mouse", 8000.00, 60,  CategoriaProducto.ELECTRONICA);
        Producto  televisor = new Producto("12", "Televisor 60", 95000.00, 8,  CategoriaProducto.ELECTRONICA);
        
        // instanciamos un objeto Inventario y le agregamos los productos
        Inventario inv = new Inventario();
        inv.agregarProducto(pantalon);
        pantalon.setCantidad(40);
        pantalon.setPrecio(25000.0);
        inv.agregarProducto(saco);
        saco.setCantidad(25);
        saco.setPrecio(63000.0);
        inv.agregarProducto(televisor);
        inv.agregarProducto(mouse);
        inv.actualizarStock("11", 400);
        inv.agregarProducto(heladera);
        inv.agregarProducto(micro);
        inv.agregarProducto(batidora);
        inv.agregarProducto(gaseosa);
        inv.agregarProducto(arroz);
        inv.agregarProducto(fideo);
        inv.agregarProducto(camisa);
        
        // Listamos los productos
        inv.listarProductos();
        
        // buscamos un producto por id y lo mostramos por consola
        Producto productoBuscado = inv.buscarProductoPorId("1");
        System.out.println("\nProducto buscado por id");
        if (productoBuscado != null){
            productoBuscado.mostrarInfo();
        }else {
            System.out.println("Producto no encontrado");
        }
        
        // Filtramos y listamos productos por categorias
        List lista = inv.filtrarPorCategoria(CategoriaProducto.ROPA);
        System.out.println("\nListado de productos filtrados por categoria\n");
        for (Object object : lista) {
            System.out.println(object);
        }
                
        // Eliminamos un producto por id y listamos los productos restantes del inventario
        inv.eliminarProducto("1");
        System.out.println("\nListado de productos posterior a la eliminacion");
        inv.listarProductos();
        
        // actualizamos el stock de un producto existente y listamos nuevamente el inventario actualizado
        inv.actualizarStock("3", 20);
        System.out.println("\nListado de productos posterior a la actualizacion de stock");
        inv.listarProductos();


        // Mostramos la cantidad total de producos del inventario
            
        System.out.println("\nEl Stock total de productos es: " + inv.obtenerStockTotal());
 
        // Obtenemos y mostramos el o los productos con mayor stock
        List maxStock = inv.obtenerProductoConMayorStock();
        System.out.println("\nListado de productos con mayor stock\n");
        for (Object object : maxStock) {
            System.out.println(object);
        }
        
        // Filtramos productos con precios entre 1000 y 3000
        inv.filtrarProductosPorPrecio(1000, 3000);
        
        // Mostramos las categorías disponibles con sus descripciones
        CategoriaProducto.mostrarCategorias();
        
        
    }
    
}
