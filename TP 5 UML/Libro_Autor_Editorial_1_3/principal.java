/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libro_autor_editorial_1_3;

public class Principal {

    public static void main(String[] args) {
        Autor frank = new Autor("Frank Herbert", "EEUU");
        Autor isaac = new Autor("Isaac Asimov", "EEUU");
        Autor aldous = new Autor("Aldous Huxley", "Britanico");
        Editorial mino = new Editorial("Minotauro", "Avenida Diagonal, "
                    + "662-664, 08034 Barcelona, España.");
        Editorial alianza = new Editorial("Alianza Editorial", 
                    "Valentín Beato, 21, 28037 Madrid, España.");
        Editorial bruge = new Editorial("Bruguera", " Carrer de l'Aldea, "
                    + "15, Barcelona, España.");
        Libro dune = new Libro("Dune", "978-8445077274", mino);
        Libro robot = new Libro("Yo, robot", "978-8435018694", alianza);
        Libro mundo = new Libro("Un mundo feliz", "978-8445000807", bruge);
        dune.setAutor(frank);
        robot.setAutor(isaac);
        mundo.setAutor(aldous);
        dune.mostrarLibro();
        robot.mostrarLibro();
        mundo.mostrarLibro();
    }
    
}
