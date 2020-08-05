/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CriterioValidacion;

import Empleado.*;
import java.util.List;
/**
 *
 * @author Jose
 */
public abstract class Criterio {
    private Empleado mejorEmpleado;
    
    public void setMejorEmpleado(Empleado empleado){
        this.mejorEmpleado = empleado;
    }
    
    public Empleado getMejorEmpleado(){
        return this.mejorEmpleado;
    }
    public abstract Empleado mejorEmpleado(List<Empleado> empleados);
}
