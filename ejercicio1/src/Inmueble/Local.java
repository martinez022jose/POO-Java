/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inmueble;

/**
 *
 * @author Jose
 */
public class Local extends Inmueble{
    
    private double valorLocal;
    
    public Local(int tamanio, int cantidadAmbientes, String tipoDeOperacion, Zona zona,double valorLocal){
        super(tamanio, cantidadAmbientes, tipoDeOperacion, zona);
        this.valorLocal = valorLocal;
      
    }
    public double getValorLocal(){
        return this.valorLocal;
    }
    
    @Override
    public double valorInmueble(){
        return this.valorLocal;
    }
}
