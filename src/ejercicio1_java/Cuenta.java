/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1_java;

/**
 *
 * @author Victor Rosario
 */
public class Cuenta {
    String titular;
    double cantidad;
    
    public Cuenta(String titular){
        this.titular = titular;
    }
    
     public Cuenta(String titular, double cantidad){
        this.titular = titular;
        this.cantidad = cantidad;
    }
     
     public String getTitula(){
         return this.titular;
     }
     
     public void setCantidad(double cantidad){
         this.cantidad = cantidad;     
     }
     
     public double getCantidad(){
         return this.cantidad;
     }
     
     public String toString(){
         return "El titular " + titular + " tiene " + cantidad + " pesos en la cuenta";
     }
}
