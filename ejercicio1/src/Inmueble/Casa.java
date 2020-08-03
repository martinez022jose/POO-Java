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
public class Casa extends Inmueble{
    
    private int valorCasa = 0;
            
    public Casa(int tamanio,int cantidadAmbientes,String tipoDeOperacion){
        super(tamanio,cantidadAmbientes,tipoDeOperacion);
     }
    
    public int getValorCasa(){
        return this.valorCasa;
    }
    
    public void setValorCasa(int valorCasa){
        this.valorCasa = valorCasa;
    }
    
    
    
    @Override
    public int valorInmueble(){
        return this.valorCasa;
    }
}

