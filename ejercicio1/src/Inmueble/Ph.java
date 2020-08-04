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
    
    private double valorPh = 0;
    
    public Ph(int tamanio,int cantidadAmbientes,String tipoDeOperacion,Zona zona){
        super(tamanio,cantidadAmbientes,tipoDeOperacion,zona);
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
    public double valorInmueble(){
        return this.valorPh + this.getZona().getPlus();
    }  
    
}


