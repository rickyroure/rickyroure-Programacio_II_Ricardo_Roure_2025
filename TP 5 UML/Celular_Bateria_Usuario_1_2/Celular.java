/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package celular_bateria_usuario_1_2;

public class Celular {
    private final String imei;
    private final String marca;
    private final String modelo;
    private Usuario usuario;
    private final Bateria bateria;    

    public Celular(String imei, String marca, String modelo, Bateria bateria) {
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria;
    }
    
    public void mostrarCelular(){
        System.out.println("Celular Marca: " + marca + ", Modelo: " + modelo +
                    ", IMEI: "+imei + ", Baterial modelo: " + bateria.getModelo() +
                    ", Capacidad: " + bateria.getCapacidad() + " mAh");
    }

    public String getImei() {
        return imei;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Bateria getBateria() {
        return bateria;
    }
    
    public void setUsuario(Usuario usuario){
        this.usuario = usuario;
        if (usuario != null && usuario.getCelular() != this){
            usuario.setCelular(this);
        }
    }
    
    public void mostrarUsuario(){
        System.out.println("Celular Marca: " + marca + ", Modelo: " + modelo +
                    ", Usuario: " + usuario.getNombre());
    }
}