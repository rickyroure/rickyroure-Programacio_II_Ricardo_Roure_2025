/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package documento_firma_usuario_1_8;

import java.time.LocalDateTime;

public class Principal {

    public static void main(String[] args) {
        Usuario juan = new Usuario("Juan Imhoff", "juanimhoff@pumas.com.ar");
        String contenidoDoc = "En Java, para destacar un texto en un "
                    + "System.out.println(), se usan codigos de escape ANSI. ";
        Documento doc1 = new Documento("Convenio de Confidencialidad", contenidoDoc, 
                    "123456545854724", LocalDateTime.now(), juan);
        doc1.mostrarDocumento();
    }
}
