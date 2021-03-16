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
public class Ejercicio1_Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Ejercicio_1
        Cuenta cuenta = new Cuenta("Victor Rosario", 100.56);
        System.out.println(cuenta.toString());
        
        Cuenta cuenta2 = new Cuenta("Lola");
        cuenta2.setCantidad(2300.50);
        System.out.println(cuenta2.toString());
        
    }
}
