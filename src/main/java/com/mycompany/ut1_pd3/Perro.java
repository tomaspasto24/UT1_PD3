/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ut1_pd3;

/**
 *
 * @author TomasUcu
 */
public class Perro {
    private String nombre;
    
    public Perro(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return this.nombre;
    }
    
    public void ladrar() {
        System.out.println("wof");
    }
    
    public boolean respondeA(String unNombre) {
        return this.nombre.equals(unNombre);
    }
}
