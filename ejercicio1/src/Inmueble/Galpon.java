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
public class Galpon extends Local{
    
     public Galpon(int tamanio, int cantidadAmbientes, String tipoDeOperacion, Zona zona,double valorGalpon){
        super(tamanio, cantidadAmbientes, tipoDeOperacion, zona, valorGalpon);
    }
     
    @Override
    public double valorInmueble(){
        return this.getValorLocal()/2;
    }
    
}
