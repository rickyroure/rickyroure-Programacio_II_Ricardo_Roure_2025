/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package documento_firma_usuario_1_8;
import java.time.LocalDateTime;

public class FirmaDigital {
    private final String codigoHash;
    private final LocalDateTime fecha;
    private final Usuario usuario;

    public FirmaDigital(String codigoHash, LocalDateTime fecha,
                Usuario usuario) {
        this.codigoHash = codigoHash;
        this.fecha = fecha;
        this.usuario = usuario;
    }

    public String getCodigoHash() {
        return codigoHash;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }
    
    public Usuario getUsuario(){
        return usuario;
    }
}
