/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ut1_pd3;

/**
 *
 * @author TomasUcu
 */
public class MainMaquinaA {
    public static void main(String[] args) {
        
        String nombrePerro = "Baton";
        
        Perro perro1 = new Perro(nombrePerro);
        
        System.out.println(perro1.getNombre());
        perro1.ladrar();
        
        if( perro1.respondeA(nombrePerro)) {
            System.out.println("Responde a Baton");
        } else {
            System.out.println("No responde a Baton");
        }
    }
}
