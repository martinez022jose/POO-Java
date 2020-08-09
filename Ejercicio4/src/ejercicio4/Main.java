/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;


import Adulto.*;
import Elementos.*;
import Legion.Legion;
import Ninio.Ninio;

/**
 *
 * @author Jose
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Instancia
        Ninio ninio = new Ninio(3,100);
        Ninio ninio2 = new Ninio(300,200);
        Comun adulto = new Comun();
        Terrorifico traje = new Terrorifico();
        Legion legion = new Legion();
        
        //Operaciones
        ninio2.agregarElemento(traje);
        //ninio.agregarElemento(traje);
        //adulto.agregarNinioQueLoAsusto(ninio2);
        //ninio.asustarA(adulto);
        legion.agregarMiembro(ninio);
        legion.agregarMiembro(ninio2);
        
        //Listar
        System.out.println(legion.getLider());
    }
    
}
