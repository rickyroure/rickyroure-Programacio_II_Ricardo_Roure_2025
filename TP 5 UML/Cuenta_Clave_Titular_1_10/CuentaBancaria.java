/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuenta_clave_titular_1_10;

import java.time.LocalDate;

public class CuentaBancaria {
    private final String cbu;
    private double saldo;
    private final ClaveSeguridad clave;
    private Titular titular;

    public CuentaBancaria(String cbu, double saldo, String codigo, 
                LocalDate fechaModiciacion){
        this.cbu = cbu;
        this.saldo = saldo;
        this.clave = new ClaveSeguridad(codigo, fechaModiciacion);
    }

    public String getCbu() {
        return cbu;
    }

    public double getSaldo() {
        return saldo;
    }

    public Titular getTitular() {
        return titular;
    }
    
    public void setTitular(Titular titular){
        this.titular = titular;
        if (titular != null && titular.getCuenta() != this){
            titular.setCuentaBancaria(this);
        }
    }
    
    public void mostrarCuenta(){
        System.out.println("CBU Cuenta: " + cbu + ", Titular: " + 
            titular.getNombre()+", Saldo: "+saldo+", Ultima modificacion "
            + "de clave: " + clave.getUltimaModificacion());
    }
    
    public void depositar(double monto){
        if (monto > 0){
            saldo += monto;
            System.out.println("Deposito Realizado. Saldo: " + saldo);
        }
    }
    
    public void extraer(double monto){
        if (saldoSuficiente(monto)){
            saldo -= monto;
            System.out.println("Extraccion Satisfactoria. Saldo: " + saldo );
        }else{
            System.out.println("Saldo insuficiente. Saldo disponible: " + saldo);
        }
    }
    private boolean saldoSuficiente(double monto){
        return saldo >= monto;
    }
    
    public String getClave(){
        return clave.getCodigo();
    }
    public void modificarClave(String codigo){
        clave.modificarClave(codigo, LocalDate.now()); 
    }
}
