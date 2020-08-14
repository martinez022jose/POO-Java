/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Individuo;

/**
 *
 * @author Jose
 */
public class Heroe extends Individuo{
    private int potenciaDePoder;
}
    public Heroe(){}
    
    @Override
    public int getPotencia(){
        return this.getNivelDeEntrenamiento() + this.getpotenciaMasAlta() + this.potenciaDePoder;
    }
