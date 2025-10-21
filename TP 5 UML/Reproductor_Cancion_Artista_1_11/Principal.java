/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reproductor_cancion_artista_1_11;

public class Principal {

    public static void main(String[] args) {
        Artista mecha = new Artista("Mercedes Sosa", "Folklore");
        Artista chalcha = new Artista("Los Chalchaleros", "Folklore");
        Artista ata = new Artista("Atahualpa Yupanqui", "Folklore");
        Cancion esperanza = new Cancion("Zamba de mi esperanza");
        Cancion lope = new Cancion("La Lopez Pereyra");
        Cancion luna = new Cancion("Luna Tucumana");
        esperanza.setArtista(mecha);
        lope.setArtista(chalcha);
        luna.setArtista(ata);
        Reproductor.reproducir(esperanza);
        Reproductor.reproducir(luna);
        Reproductor.reproducir(lope);
    }
}