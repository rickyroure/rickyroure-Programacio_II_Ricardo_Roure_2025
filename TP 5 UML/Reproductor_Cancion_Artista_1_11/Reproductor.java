/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reproductor_cancion_artista_1_11;

public class Reproductor {

    private Reproductor(){
    }
    
    public static void reproducir(Cancion cancion){
        System.out.println("Reproduciendo cancion " + cancion.getTitulo());
    }
}
