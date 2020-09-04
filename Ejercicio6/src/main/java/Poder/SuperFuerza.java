/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Poder;

import Individuo.*;



/**
 *
 * @author Jose
 */
public class SuperFuerza extends Poder{
    private int potencia;
    
    public SuperFuerza(int potencia){
       this.potencia = potencia;
   
    }
    
    public int getPotencia(){
        return this.potencia;
    }
    
    public void setPotencia(int potenciaNueva){
        this.potencia = potenciaNueva;
    }

    @Override
    public String toString() {
        return "SuperFuerza{" + "potencia=" + potencia + '}';
    }
    
    @Override
    public int otorgaPotencia(){
        return this.potencia;
    }
    
    @Override 
    public void incrementarRespecto(Individuo otro){
        this.potencia+=1;
    }
}
