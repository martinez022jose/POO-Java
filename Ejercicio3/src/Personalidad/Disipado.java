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
public class Disipado implements Personalidad{
    private double porcentaje;
    
    public Disipado(double porcentaje){
        this.porcentaje = porcentaje/100;
    }
    
    @Override
    public void realizarAccionComplot(Personaje objetivo,Conspiracion conspiracion){
        double perdida = objetivo.getCasa().getPatrimonio()* this.porcentaje;
        objetivo.getCasa().setPatrimonio(objetivo.getCasa().getPatrimonio() - perdida);
    }
    
}
