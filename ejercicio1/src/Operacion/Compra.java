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
public class Compra extends Operacion{
    private double porcentaje = 0.0;
    private double comision;
    
    public Compra(Inmueble inmueble,double porcentaje){
        super(inmueble);
        this.porcentaje = porcentaje/100;
    }
    
    public void definirComision(){
        this.comision = this.porcentaje*this.getInmueble().valorInmueble();
    }
    
    @Override
    public double comision(){
        this.definirComision();
        return this.comision;
    }
    
}
