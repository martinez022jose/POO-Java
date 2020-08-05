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
public class CriterioMayorComisionRecibida extends Criterio{
    
   @Override
    public Empleado mejorEmpleado(List<Empleado> empleados){
        this.setMejorEmpleado(empleados.get(0));
        int i = 1;
        while(i<empleados.size()){
            if(empleados.get(i).totalDeComisiones() > this.getMejorEmpleado().totalDeComisiones()){
                this.setMejorEmpleado(empleados.get(i));
            }
            i++;
        }
        return this.getMejorEmpleado();
        
    }
}
