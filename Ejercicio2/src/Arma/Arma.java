/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arma;

/**
 *
 * @author Jose
 */
public class Arma {
    private String nombre;
    private int potencia;
    public Arma(String nombre,int potencia){
        this.nombre = nombre;
        this.potencia = potencia;
        
    }
    
    public int getPotencia(){
        return this.potencia;
    }
    
    public String getNombre(){
        return this.nombre;
    }
}
