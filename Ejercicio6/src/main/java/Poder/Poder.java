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
public interface Poder{
    
    public abstract int getPotencia();
    
    public abstract int otorgaPotencia();
    
    public abstract void incrementarRespecto(Individuo otro);
    
    

}
