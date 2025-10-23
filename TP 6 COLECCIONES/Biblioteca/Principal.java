/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Biblioteca;

public class Principal {

    public static void main(String[] args) {
        Autor borges = new Autor("1", "Jorge Luis Borges", "Argentino");
        Autor cervantes = new Autor("2", "Miguel de Cervantes Saavedra", "Español");
        Autor garcia = new Autor("3", "Gabiel Jose de la Concordia Garcia Marquez", "Colombiano");
        
        Biblioteca alberdi = new Biblioteca("Albedri");
        alberdi.agregarLibro("978-6073104920", "Ficciones", 1944, borges);
        alberdi.agregarLibro("978-8499089515", "El Aleph", 1949, borges);
        alberdi.agregarLibro("978-8408054832", "El Libro de Arena", 1975, borges);
        alberdi.agregarLibro("978-8497592208", "Cien A#os de Soledad", 1967, garcia);
        alberdi.agregarLibro("978-8497592451", "El Amor en los Tiempos del Colera", 1985, garcia);
        alberdi.agregarLibro("978-8497592437", "Cronica de una Muerte Anunciada", 1981, garcia);
        alberdi.agregarLibro("978-8437601175", "El Ingenioso Hidalgo Don Quijote de la Mancha", 1605, cervantes);
        alberdi.agregarLibro("978-8467044010", "Novelas Ejemplares", 1613, cervantes);
        alberdi.agregarLibro("978-8437613154", "La Galatea", 1585, cervantes);
        // listamos los libros que tiene la biblioteca
        alberdi.listarLibros();
        // Buscamos un libro por si isbn
        System.out.println("\nBUSCAMOS UN LIBRO POR ISBN");
        Libro libroBuscado = alberdi.buscarLibroPorIsbn("978-8497592208");
        if (libroBuscado != null){
            libroBuscado.mostrarInfo();
        }else{
            System.out.println("Libro no encontrado");
        }
        alberdi.obtenerCantidadLibros();
        // Eliminamos un libro por ISBN
        System.out.println("\nELIMINAMOS UN LIBRO POR ISBN"); //Borrar esta linea
        alberdi.eliminarLibro("978-8497592208");
        alberdi.listarLibros();
        // Mostramos la cantidad de libros de la biblioteca
        System.out.println("");
        alberdi.obtenerCantidadLibros();
        // Mostramos los libros por año
        System.out.println("\nFILTRAMOS LIBROS POR A#O");
        alberdi.filtrarLibrosPorAnio(1944);
        // Mostramos los autores dispobibles en la biblioteca
        System.out.println("\nAUTORES DISPONIBLES EN LA BIBLIOTECA");   
        alberdi.mostrarAutoresDisponibles();
    }
    
}
