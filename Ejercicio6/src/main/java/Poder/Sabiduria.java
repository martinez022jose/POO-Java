/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Poder;

/**
 *
 * @author Jose
 */
public class Sabiduria extends Poder {
    private int cantidadBatallas;
    
    public Sabiduria(int cantidadBatallas){
        this.cantidadBatallas = cantidadBatallas;
    }
    
    @Override
    public int otorgaPotencia(){
        return 3 * cantidadBatallas;
    }
    
    @Override 
    public void incrementar(){
        
    }
}
