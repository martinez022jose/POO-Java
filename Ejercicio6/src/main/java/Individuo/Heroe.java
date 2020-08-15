/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Individuo;

import Poder.Poder;

/**
 *
 * @author Jose
 */
public class Heroe extends Individuo{
    private Poder poder;

    public Heroe(int nivelDeEntrenamiento,Poder poder){
        super(nivelDeEntrenamiento);
        this.poder = poder;
    }
    
    public void setPoder(Poder poder){
        this.poder = poder;
    }
    
    public Poder getPoder(){
        return this.poder;
    }
    
    @Override
    public int getPotencia(){
        return this.getNivelDeEntrenamiento() + this.getpotenciaMasAlta() + this.poder.otorgaPotencia();
    }
    
    @Override
    public void  ganaPeleaContra(Individuo otro){
        if(this.getPotencia() > otro.getPotencia()){
           // this.getPoder().incrementarRespecto(otro);
        }
    }
}