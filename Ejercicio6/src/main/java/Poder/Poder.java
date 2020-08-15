/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Poder;

import Individuo.Individuo;

/**
 *
 * @author Jose
 */
public abstract class Poder {
    public abstract int otorgaPotencia();
    
    public abstract void incrementarRespecto(Individuo otro);

}
