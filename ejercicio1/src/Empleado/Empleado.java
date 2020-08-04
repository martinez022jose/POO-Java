/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empleado;

import Inmueble.*;
import Operacion.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jose
 */
public class Empleado{
    
    private List<Operacion> operacionesRealizadas = null;
    private List<Inmueble> reservados = null;
    private double totalComision = 0;
    
    public Empleado(){
        this.reservados = new ArrayList<>();
        this.operacionesRealizadas = new ArrayList<>();
    }
    
    public void reservarInmueble(Inmueble inmueble){
        if(!(this.reservados.contains(inmueble))){
            this.reservados.add(inmueble);
        }else{
            System.out.println("El elemento se encuentra como reservado");
        }
    }
    
    public List<Operacion> getOperacionesRealizadas(){
        return this.operacionesRealizadas;
    }
    
    public void realizaOperacion(Operacion operacion){
        this.operacionesRealizadas.add(operacion);
    }
    
    public double totalDeComisiones(){
        this.operacionesRealizadas.forEach((op) -> {
            this.totalComision+=op.comision();
        });
        return this.totalComision;
    }
  
    
 
    
   
}
