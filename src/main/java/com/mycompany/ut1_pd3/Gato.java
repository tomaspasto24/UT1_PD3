/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ut1_pd3;

/**
 *
 * @author juan-
 */
public class Gato implements Mamifero {
    
    // Paso 1
    private String nombre;
    
    public Gato(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void maullar(){
        System.out.println("miau");
    }
    public boolean respondeA(String unNombre){
        return false;
    }
  
    //Paso 4
    public void caminar() {
        System.out.println(getNombre() + " está caminando...");
    }

    public void correr() {
        System.out.println(getNombre() + " está corriendo...");
        
    }

    public void saltar() {
        System.out.println(getNombre() + " está saltando...");
    }
}
