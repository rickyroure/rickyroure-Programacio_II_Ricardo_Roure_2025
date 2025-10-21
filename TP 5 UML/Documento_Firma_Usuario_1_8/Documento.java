/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package documento_firma_usuario_1_8;
import java.time.LocalDateTime;

public class Documento {
    private final String titulo;
    private final String contenido;
    private final FirmaDigital firma;
   

    public Documento(String titulo, String contenido, String firma, 
                LocalDateTime fecha, Usuario usuario) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.firma = new FirmaDigital(firma, fecha, usuario);
      }
    
    public void mostrarDocumento(){
        System.out.println("Titulo: " + titulo + ", Contenido: " + contenido +
                    ", Firma digital: " + firma.getCodigoHash() + ", Fecha: " +
                    firma.getFecha() + ", Usuario: " + 
                    firma.getUsuario().getNombre());
    }
}
