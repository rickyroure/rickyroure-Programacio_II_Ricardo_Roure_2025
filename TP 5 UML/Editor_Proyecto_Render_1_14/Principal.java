/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package editor_proyecto_render_1_14;

public class Principal {

    public static void main(String[] args) {
        Proyecto p1 = new Proyecto("TP Probabilidad y Estadistica", 7);
        EditorVideo.exportar("mp4", p1);
        System.out.println(p1);
              
    }
}