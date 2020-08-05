/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import Inmueble.*;
import Operacion.*;
import Empleado.*;
import CriterioValidacion.*;
import Inmobiliaria.*;
/**
 *
 * @author Jose
 */
public class Main {
    
    public static void main(String [] args){
        
        //Instanciamos 
        Zona zona1 = new Zona("mataderos",30);
        Departamento dep = new Departamento(100,6,"alquiler",zona1);
        Casa casa = new Casa(100,5,"alquiler",zona1);
        Compra op1 = new Compra(casa,10);
        Compra op2 = new Compra(casa,20);
        Empleado emp = new Empleado("Jose");
        Empleado emp2 = new Empleado("Pedro");
        Inmobiliaria inmo = new Inmobiliaria();
        CriterioSegunCantidadDeOperacionesCerradas criterio1 = new CriterioSegunCantidadDeOperacionesCerradas();
        CriterioMayorComisionRecibida criterio2 = new CriterioMayorComisionRecibida();
        //Operaciones
        casa.setValorCasa(100);
        emp.realizaOperacion(op1);
        emp.realizaOperacion(op2);
       
        emp2.realizaOperacion(op2);
        emp2.realizaOperacion(op2);
        emp2.realizaOperacion(op2);
        inmo.agregarCriterio(criterio2);
        inmo.agregarEmpleado(emp);
        inmo.agregarEmpleado(emp2);
        
        //Listar
        System.out.println(inmo.getHistorialOperaciones());
       
      
        System.out.println("----------------------");
  
    }
}
