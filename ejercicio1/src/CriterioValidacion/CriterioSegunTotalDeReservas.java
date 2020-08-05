/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CriterioValidacion;

import java.util.List;
import Empleado.*;
/**
 *
 * @author Jose
 */
public class CriterioSegunTotalDeReservas extends Criterio{
    
    public CriterioSegunTotalDeReservas(){}
    
    @Override
    public Empleado mejorEmpleado(List<Empleado> empleados){
        int i = 1;
        this.setMejorEmpleado(empleados.get(0));
        while(i<empleados.size()){
            if(empleados.get(i).totalDeReservas() > this.getMejorEmpleado().totalDeReservas()){
                this.setMejorEmpleado(empleados.get(i));
            }
            i++;
        }
        return this.getMejorEmpleado();
    }
}
