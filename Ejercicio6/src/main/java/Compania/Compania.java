/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Compania;

import Individuo.*;
import Individuo.Individuo;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


/**
 *
 * @author Jose
 */
public class Compania {
    private List<Individuo> empleados;
    
    public Compania(){
        this.empleados = new ArrayList<>();
    }
    
    public List<Individuo> getEmpleados(){
        return this.empleados;
    }
    
    public List<Individuo> enfrentamientoMasDuros(){
        return this.empleados.stream().map(empleado->empleado.enfrentamientoMasDuro()).collect(Collectors.toList());
    }

    public int totalPotencia(){
        return this.empleados.stream().filter(empleado->empleado.esDeConfianza()).collect(Collectors.toList()).stream().mapToInt(empleado->empleado.getPotencia()).sum();
    }
    
    public boolean ElNuestroLeGanaAtodos(Individuo individuo,Compania otro){
        boolean estado = false;
        for(Individuo empleado: otro.getEmpleados()){
            if(individuo.getPotencia() > empleado.getPotencia() && individuo.getHistorial().size() > empleado.getHistorial().size()){
                estado = true;
            }
        }
        return estado;
    }
    
    public boolean destruyeAOtraCompania(Compania otra){
        for(Individuo empleado: this.empleados){
             return this.ElNuestroLeGanaAtodos(empleado, otra);
        }
        return false;
    }
}
