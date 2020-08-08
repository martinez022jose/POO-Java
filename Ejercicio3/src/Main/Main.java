/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import Casa.*;
import Personaje.*;

/**
 *
 * @author Jose
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        Stark casa1 = new Stark(100,"Somos Stark");
        Lannister casa2 = new Lannister(300000,"Somos Lanister");
        GuardiaDeLaNoche casa3 = new GuardiaDeLaNoche(20,"Somos guardianes");
       
        Personaje per1 = new Personaje(casa1);
        Personaje per4 = new Personaje(casa1);
        Personaje per2 = new Personaje(casa2);
        Personaje per3 = new Personaje(casa3);
        
        casa1.agregarMiembro(per1);
        casa1.agregarMiembro(per2);
        
        System.out.println(per1.patrimonioTotal());
        
    }
    
}
