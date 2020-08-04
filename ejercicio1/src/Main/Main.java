/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import Inmueble.*;
import Operacion.*;
import Empleado.*;
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
        Empleado emp = new Empleado();

        //Operaciones
        casa.setValorCasa(100);
        emp.realizaOperacion(op1);
        
        //Listar
        System.out.println(emp.getOperacionesRealizadas());
        System.out.println(emp.totalDeComisiones());
      
        System.out.println("----------------------");
  
    }
}
