/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import Inmueble.*;
import Operacion.*;
/**
 *
 * @author Jose
 */
public class Main {
    
    public static void main(String [] args){
        Departamento dep = new Departamento(100,6,"alquiler");
        Casa casa = new Casa(100,5,"alquiler");
        System.out.println(dep.valorInmueble());
        System.out.println(casa.valorInmueble());
        casa.setValorCasa(100);
        System.out.println("----------------------");
        System.out.println(casa.valorInmueble());
        
        Compra comp = new Compra(casa,10);
        System.out.println((comp.comision()));
    }
}
