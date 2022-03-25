/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ut1_pd3;

/**
 *
 * @author juan-
 */
public class MainMáquinaB {

    public static void main(String[] args) {
        String nombreGato = "Michi";
        
        Gato gato1 = new Gato(nombreGato);
        
        System.out.println(gato1.getNombre());
        gato1.maullar();
        
        if( gato1.respondeA(nombreGato)) {
            System.out.println("Responde a Michi");
        } else {
            System.out.println("No responde a Michi");
        }
    }
}
