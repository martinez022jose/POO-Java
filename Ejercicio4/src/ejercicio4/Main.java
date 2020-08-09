/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;


import Adulto.*;
import Elementos.*;
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
        Ninio ninio = new Ninio(3,10);
        Ninio ninio2 = new Ninio(3,20);
        Comun adulto = new Comun();
        Terrorifico traje = new Terrorifico();
        
        //Operaciones
        ninio.agregarElemento(traje);
        ninio.agregarElemento(traje);
        adulto.agregarNinioQueLoAsusto(ninio2);
        ninio.asustarA(adulto);
        
        //Listar
        System.out.println(ninio.getCantidadDeCaramelos());
    }
    
}
