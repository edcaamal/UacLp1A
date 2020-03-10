/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package github1a;

/**
 *
 * @author edgar
 */
public class GitHub1a {
    static void imprimirMensaje(String mensaje){
        System.out.println(mensaje);
    }
    static void imprimirSeparador(){
        System.out.println("----------------------------------");
    }
    static void imprimirPie(){
        imprimirSeparador();
        imprimirMensaje("(c) EDCD 2020");
    }

    static void imprimirBody(){
        imprimirMensaje("Hola Mundo");
        imprimirMensaje("Saludos UAC-FI-ISC 2020");
        imprimirMensaje("Probando el Git");
        imprimirMensaje("Prueba de Edgar Caamal");
    }
    
    static void imprimirEncabezado(){
        imprimirMensaje("Bienvenidos al Fasinante mundo de la Programacion");
        imprimirMensaje("Lenguajes de programación Java con NetBeans");
        imprimirSeparador();
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        imprimirEncabezado();
        imprimirBody();
        imprimirPie();
        
    }
    
}
