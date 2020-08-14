/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Individuo;

import Arma.Arma;
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
    
    public int getNivelDeEntrenamiento(){
        return this.nivelDeEntrenamiento;
    }
    
    public List<Arma> getArmas(){
        return this.armas;
    }
    
    public void setArmas(List<Arma> armas){
        this.armas = armas;
    }
    
    public void setPotencia(int potencia){
        this.potencia = potencia;
    }
    
    public int getpotenciaMasAlta(){
        return this.armas.stream().mapToInt(arma->arma.getPotencia()).max().getAsInt();
    }
    
     public abstract int getPotencia();
   
}
