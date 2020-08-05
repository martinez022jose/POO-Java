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
    private String nombreEmpleado;
    private List<Operacion> operacionesRealizadas = null;
    private List<Inmueble> reservados = null;
    private double totalComision = 0;
    private int totalOpCerradas;
    private int totalReservas;
    
    public Empleado(String nombreEmpleado){
        this.reservados = new ArrayList<>();
        this.operacionesRealizadas = new ArrayList<>();
        this.nombreEmpleado = nombreEmpleado;
    }
    
    public List<Inmueble> getInmueblesConcretados(){
        List<Inmueble> inmueblesConcretados = new ArrayList<>();
        this.operacionesRealizadas.forEach((op)->{
            inmueblesConcretados.add(op.getInmueble());
        });
        return inmueblesConcretados;
    }
    
    public void reservarInmueble(Inmueble inmueble){
        if(!(this.reservados.contains(inmueble))){
            this.reservados.add(inmueble);
        }else{
            System.out.println("El elemento ya se encuentra como reservado");
        }
    }
    
    public List<String> zonasDondeCerraronOperaciones(){
        List<String> zonas = new ArrayList<>();
        this.operacionesRealizadas.forEach((op)->{
            zonas.add(op.getInmueble().getZona().nombreZona());
        });
        return zonas;
    }
    
    public List<Inmueble> getReservas(){
        return this.reservados;
        
    }
    public String getNombreEmpleado(){
        return this.nombreEmpleado;
    }
    
    public int totalDeOperacionesCerradas(){
        this.totalOpCerradas = this.operacionesRealizadas.size();
        return this.totalOpCerradas;    

    }
    public List<Operacion> getOperacionesRealizadas(){
        return this.operacionesRealizadas;
    }
    
    public void realizaOperacion(Operacion operacion){
        this.operacionesRealizadas.add(operacion);
    }
    
    public int totalDeReservas(){
        this.totalReservas = this.reservados.size();
        return this.totalReservas;
    }
    
    public double totalDeComisiones(){
        this.operacionesRealizadas.forEach((op) -> {
            this.totalComision+=op.comision();
        });
        return this.totalComision;
    }
    
    public void listarEmpleado(){
         System.out.println("Empleado{"+this.nombreEmpleado+"}");
    }
    
 
    
   
}
