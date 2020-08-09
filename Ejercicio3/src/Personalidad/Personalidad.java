/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personalidad;

import Conspiracion.Conspiracion;
import Personaje.Personaje;

/**
 *
 * @author Jose
 */
public interface Personalidad {
    
     public abstract void realizarAccionComplot(Personaje objetivo,Conspiracion conspiracion);
     
}
