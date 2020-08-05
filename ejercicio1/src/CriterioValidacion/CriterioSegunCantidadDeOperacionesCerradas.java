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
public class CriterioSegunCantidadDeOperacionesCerradas extends Criterio{
    
    public CriterioSegunCantidadDeOperacionesCerradas (){}
    
    @Override
    public Empleado mejorEmpleado(List<Empleado> empleados){
        int i = 1;
        this.setMejorEmpleado(empleados.get(0));
        while(i<empleados.size()){
            if(empleados.get(i).totalDeOperacionesCerradas() > this.getMejorEmpleado().totalDeOperacionesCerradas()){
                this.setMejorEmpleado(empleados.get(i));
            }
            i++;
        }
        return this.getMejorEmpleado();
    }
}
