/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Individuo;

import Arma.Arma;
import Poder.Poder;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jose
 */
public abstract class Individuo {
    private int nivelDeEntrenamiento;
    private List<Arma> armas;
    private int potencia;
    private Poder poder;
    
    public Individuo(int nivelDeEntrenamiento){
        this.nivelDeEntrenamiento = nivelDeEntrenamiento;
        this.armas = new ArrayList<>();
        
    }
    
    public void setPoder(Poder poder){
        this.poder = poder;
    }
    
    public Poder getPoder(){
        return this.poder;
    }
    
    public void incrementarNivelDeEntrenamiento(){
        if(this.nivelDeEntrenamiento < 1000){
            this.nivelDeEntrenamiento+=1;
        }else{
            this.nivelDeEntrenamiento = 1000;
        }
    }
    
    public int getNivelDeEntrenamiento(){
        return this.nivelDeEntrenamiento;
    }
    
    
    public List<Arma> getArmas(){
        return this.armas;
    }
    
    public void iniciarArmas(){
        this.armas = new ArrayList<>();
    }
    
    public void agregarArma(Arma arma){
        this.armas.add(arma);
    }
    
    public void setPotencia(int potencia){
        this.potencia = potencia;
    }
    
    public int getpotenciaMasAlta(){
        return this.armas.stream().mapToInt(arma->arma.getPotencia()).max().getAsInt();
    }
    
    public abstract void  ganaPeleaContra(Individuo otro);
    
     public abstract int getPotencia();
     
  
   
}
