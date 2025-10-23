/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaStock;

public class Producto {
    private String id;
    private String nombre;
    private double precio;
    private int cantidad;
    private CategoriaProducto categoria;

    public Producto(String id, String nombre, double precio, int cantidad,
                CategoriaProducto categoria) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.categoria = categoria;
    }

    public Producto(String id, String nombre, CategoriaProducto categoria) {
        this.id = id;
        this.nombre = nombre;
        this.precio = 0.0;
        this.cantidad = 0;
        this.categoria = categoria;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public CategoriaProducto getCategoria() {
        return categoria;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCantidad(int cantidad) {
        if (cantidad > 0){
        this.cantidad = cantidad;
        }else{
            System.out.println("No se actualizó la cantidad. El valor debe ser "
                        + "entero y mayor que 0");
        }
    }
    
    public void mostrarInfo(){
       System.out.println("Id: " +id + ", Nombre: " +nombre + ", Categoria: " +
                    categoria + ", Precio: " +precio+ ", Cantidad: "+cantidad);
        
    }

    @Override
    public String toString() {
        return "Producto{" + "id=" + id + ", nombre=" + nombre + ", precio=" +
                    precio + ", cantidad=" + cantidad + ", categoria=" + 
                    categoria + '}';
    }
    
    
}
