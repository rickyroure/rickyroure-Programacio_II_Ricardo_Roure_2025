/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp_5_uml;


public class Pasaporte_Foto_Titular_1_1 {
    private String imagen;
    private String formato;
    
    // Constructor
    public Pasaporte_Foto_Titular_1_1 formato) {
        this.imagen = imagen;
        this.formato = formato;
    }
    
    // Getters y Setters
    public String getImagen() {
        return imagen;
    }
    
    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
    
    public String getFormato() {
        return formato;
    }
    
    public void setFormato(String formato) {
        this.formato = formato;
    }
    
    @Override
    public String toString() {
        return "Foto{imagen='" + imagen + "', formato='" + formato + "'}";
    }
}

// Clase Titular
public class Titular {
    private String nombre;
    private String dni;
    private Pasaporte pasaporte; // Asociación bidireccional
    
    // Constructor
    public Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
    
    // Getters y Setters
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getDni() {
        return dni;
    }
    
    public void setDni(String dni) {
        this.dni = dni;
    }
    
    public Pasaporte getPasaporte() {
        return pasaporte;
    }
    
    public void setPasaporte(Pasaporte pasaporte) {
        this.pasaporte = pasaporte;
    }
    
    @Override
    public String toString() {
        return "Titular{nombre='" + nombre + "', dni='" + dni + "'}";
    }
}

// Clase Pasaporte
public class Pasaporte {
    private String numero;
    private String fechaEmision;
    private Foto foto; // Composición - la foto no puede existir sin el pasaporte
    private Titular titular; // Asociación bidireccional
    
    // Constructor
    public Pasaporte(String numero, String fechaEmision, String imagenFoto, String formatoFoto) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        // Composición: el pasaporte crea y es dueño de la foto
        this.foto = new Foto(imagenFoto, formatoFoto);
    }
    
    // Método para establecer la relación bidireccional con Titular
    public void setTitular(Titular titular) {
        // Si ya tenía un titular, quitamos la referencia
        if (this.titular != null) {
            this.titular.setPasaporte(null);
        }
        
        this.titular = titular;
        
        // Establecemos la referencia bidireccional
        if (titular != null) {
            titular.setPasaporte(this);
        }
    }
    
    // Getters
    public String getNumero() {
        return numero;
    }
    
    public String getFechaEmision() {
        return fechaEmision;
    }
    
    public Foto getFoto() {
        return foto;
    }
    
    public Titular getTitular() {
        return titular;
    }
    
    // Setters
    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    public void setFechaEmision(String fechaEmision) {
        this.fechaEmision = fechaEmision;
    }
    
    @Override
    public String toString() {
        return "Pasaporte{numero='" + numero + "', fechaEmision='" + fechaEmision + 
               "', foto=" + foto + ", titular=" + (titular != null ? titular.getNombre() : "null") + "}";
    }
}

// Clase de prueba
public class TestPasaporte {
    public static void main(String[] args) {
        // Crear un titular
        Titular titular = new Titular("Juan Pérez", "12345678");
        
        // Crear un pasaporte (que automáticamente crea su foto por composición)
        Pasaporte pasaporte = new Pasaporte("AB123456", "2024-01-15", "foto_juan.jpg", "JPEG");
        
        // Establecer la relación bidireccional
        pasaporte.setTitular(titular);
        
        // Verificar las relaciones
        System.out.println("Pasaporte: " + pasaporte);
        System.out.println("Titular del pasaporte: " + titular);
        System.out.println("Pasaporte del titular: " + titular.getPasaporte());
        
        // Demostrar la composición: si se destruye el pasaporte, la foto también
        System.out.println("Foto del pasaporte: " + pasaporte.getFoto());
    }
}

