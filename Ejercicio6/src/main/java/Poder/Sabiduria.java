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
public class Sabiduria implements Poder {
    private int cantidadBatallas;
    
    public Sabiduria(int cantidadBatallas){
        this.cantidadBatallas = cantidadBatallas;
    }
    
    @Override
    public int getPotencia(){
        return 0;
    }
    
    @Override
    public int otorgaPotencia(){
        return 3 * this.cantidadBatallas;
    }
    
    @Override 
    public void incrementarRespecto(Individuo otro){
        // No sucede nada
    }
}
