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
public class ALaCalle extends Local{
    
    public ALaCalle(int tamanio, int cantidadAmbientes, String tipoDeOperacion, Zona zona,double valorFijo){
        super(tamanio, cantidadAmbientes, tipoDeOperacion, zona, valorFijo);
    }
   
    @Override
    public double valorInmueble(){
        return this.getValorLocal();
    }
}
