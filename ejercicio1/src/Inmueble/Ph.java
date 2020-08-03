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
public class Ph extends Inmueble{
    
    private int valorPh = 0;
    
    public Ph(int tamanio,int cantidadAmbientes,String tipoDeOperacion){
        super(tamanio,cantidadAmbientes,tipoDeOperacion);
        this.definirValorPh();
    }
    
    public final void definirValorPh(){
        if(this.getTamanio() * 14000 < 500000){
            this.valorPh = this.getTamanio() * 14000;
        }else{
            this.valorPh = 500000;
        }
     }
    
    @Override
    public int valorInmueble(){
        return this.valorPh;
    }  
    
}


