/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Operacion;
import Inmueble.*;

/**
 *
 * @author Jose
 */
public class Alquiler extends Operacion{
    private int cantidadMeses = 0;
    private double comision;
    
    public Alquiler(Inmueble inmueble,int cantidadMeses){
        super(inmueble);
        this.cantidadMeses = cantidadMeses;
    }
    
    public void definirComision(){
        this.comision = (this.cantidadMeses * this.getInmueble().valorInmueble()) / 50000;
        
    }
    
    @Override
    public double comision(){
        this.definirComision();
        return this.comision;
        
    }
    
}

        
   
    
    
    

