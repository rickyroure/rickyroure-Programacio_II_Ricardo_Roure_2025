/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libro_autor_editorial_1_3;

public class Libro {
    private final String titulo;
    private Autor autor;
    private final Editorial editorial;

    public Libro(String titulo, String isbn, Editorial editorial) {
        this.titulo = titulo;
        this.editorial = editorial;
    }
    
    public void setAutor(Autor autor){
        this.autor = autor;
    }
    
    public void mostrarLibro(){
        System.out.println("Titulo: " + titulo + ", Autor: " + autor.getNombre() 
                    + ", Editorial: " + editorial.getNombre());
    }
}