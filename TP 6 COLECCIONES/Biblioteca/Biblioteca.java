/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private final List<Libro> libros;

    public Biblioteca(String nombre) {
        this.libros = new ArrayList<>();
    }
    public void agregarLibro(String isbn, String titulo, int anio, Autor autor){
        libros.add(new Libro(isbn, titulo, anio, autor));
    }
    public void listarLibros(){
        System.out.println("\n LIBROS DISPONIBLES");
        for (Libro libro : libros) {
            libro.mostrarInfo();
        }
    }
    public Libro buscarLibroPorIsbn(String isbn){
        int i = 0;
        Libro libroBuscado = null;
        while (i < libros.size() && !this.libros.get(i).getIsbn().equals(isbn)){
            i++;
        }
        if (i < libros.size()){
            libroBuscado = libros.get(i);
        }
        return libroBuscado;
    }
    public void eliminarLibro(String isbn){
        Libro libroEliminar = buscarLibroPorIsbn(isbn);
        if (libroEliminar != null){
            libros.remove(libroEliminar);
            System.out.println("Libro eliminado satisfactoriamente");
        }else{
            System.out.println("Libro a eliminar no encontrado");
        }
    }
    public void obtenerCantidadLibros(){
        System.out.println("Esta biblioteca tiene " + libros.size() + " libros");
    }
    public void filtrarLibrosPorAnio(int anio){
        for (Libro libro : libros) {
            if(libro.getAnio() == anio){
                libro.mostrarInfo();
            }
        }
    }
    public void mostrarAutoresDisponibles(){
        List autoresDisponibles = new ArrayList<>();
        for (Libro libro : libros) {
            if (!autoresDisponibles.contains(libro.getAutor().getNombre())){
                autoresDisponibles.add(libro.getAutor().getNombre());
            }
        }
        for (Object autoresDisponible : autoresDisponibles) {
            System.out.println(autoresDisponible.toString());
        }
    }
}