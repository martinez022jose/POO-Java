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
public abstract class Operacion {
    private Inmueble inmueble;
    
    public Operacion(Inmueble inmueble){
        this.inmueble = inmueble;
    }
    
    public Inmueble getInmueble(){
        return this.inmueble;
    }
    
    public void setInmueble(Inmueble inmueble){
        this.inmueble = inmueble;
    }
   
    public abstract double comision();
}
