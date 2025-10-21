/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package editor_proyecto_render_1_14;

public class EditorVideo {
    
    public static void exportar(String formato, Proyecto proyecto){
        Render r1 = new Render(formato);
        r1.setProyecto(proyecto);
    }
}