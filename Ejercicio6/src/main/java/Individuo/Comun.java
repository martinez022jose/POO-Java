/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Individuo;

import Arma.Arma;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 *
 * @author Jose
 */
public class Comun extends Individuo{
    
    
    public Comun(int nivelDeEntrenamiento){
        super(nivelDeEntrenamiento);
    }
  
    @Override
    public int getPotencia(){
        return this.getNivelDeEntrenamiento() + this.getpotenciaMasAlta();
    }
    
    
    @Override
    public void  ganaPeleaContra(Individuo otro){
        if(this.getPotencia() > otro.getPotencia()){
            this.incrementarNivelDeEntrenamiento();
        }
    }
    
    
   

    
}
