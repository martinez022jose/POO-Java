/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inmobiliaria;
import Operacion.*;
import Empleado.*;
import CriterioValidacion.*;
import java.util.ArrayList;
import java.util.List;
//import java.util.Map;
//import java.util.stream.Collectors;
/**
 *
 * @author Jose
 */
public class Inmobiliaria {
  
    private List<Operacion> historialOperaciones= null;
    private List<Empleado> empleados = null;
    private List<Criterio> criterios = null;
    private Empleado mejorEmpleado;
    
    public Inmobiliaria(){
        this.historialOperaciones = new ArrayList<>();
        this.empleados = new ArrayList<>();
        this.criterios = new ArrayList<>();
    }
    
    public List<Operacion> getHistorialOperaciones(){
        this.empleados.forEach((emp)->{
            this.historialOperaciones.addAll(emp.getOperacionesRealizadas());
        });
        return this.historialOperaciones;
    }
    public Empleado mejorEmpleado(){
        this.criterios.forEach((criterio)->{
            this.mejorEmpleado = criterio.mejorEmpleado(this.empleados);
        });
        return this.mejorEmpleado;
    }
    
    public void agregarCriterio(Criterio criterio){
        this.criterios.add(criterio);
    }
    
    public void eliminarCriterio(Criterio criterio){
        this.criterios.remove(criterio);
    }
    
    public void agregarEmpleado(Empleado empleado){
        this.empleados.add(empleado);
   
    }
    
    public void agregarOperacion(Operacion operacion){
        this.historialOperaciones.add(operacion);
    }
    
    public boolean cerraronEnMismaZona(Empleado emp,Empleado emp2){
        return emp.zonasDondeCerraronOperaciones().containsAll(emp2.zonasDondeCerraronOperaciones());
    }
    
    public boolean concretoAlgunReservadoDeOtro(Empleado emp,Empleado emp2){
        return emp.getReservas().containsAll(emp2.getInmueblesConcretados()) || emp2.getReservas().containsAll(emp.getInmueblesConcretados());
    }
    public boolean existeProblemaEntre(Empleado emp,Empleado emp2){
        return (this.cerraronEnMismaZona(emp,emp2) && this.concretoAlgunReservadoDeOtro(emp,emp2));
            
    }
    
    public List<String> nombresEmpleados(){
        List<String> nombres = new ArrayList<>();
        this.empleados.forEach((empleado)->{
            nombres.add(empleado.getNombreEmpleado());
        });
        return nombres;
    }
}
