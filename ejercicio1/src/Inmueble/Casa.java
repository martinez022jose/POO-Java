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
    
    private double valorCasa = 0;
            
    public Casa(int tamanio,int cantidadAmbientes,String tipoDeOperacion,Zona zona){
        super(tamanio,cantidadAmbientes,tipoDeOperacion,zona);
     }
    
    public double getValorCasa(){
        return this.valorCasa;
    }
    
    public void setValorCasa(double valorCasa){
        this.valorCasa = valorCasa;
    }
   
    @Override
    public double valorInmueble(){
        return this.valorCasa + this.getZona().getPlus();
    }
}

