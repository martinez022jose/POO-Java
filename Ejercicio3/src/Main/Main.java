/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;
import Casa.*;
import Personaje.*;
import Conspiracion.*;
import Personalidad.*;
/**
 *
 * @author Jose
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        Stark casa1 = new Stark(1000,"Somos Stark");
        Lannister casa2 = new Lannister(300000,"Somos Lanister");
        GuardiaDeLaNoche casa3 = new GuardiaDeLaNoche(20,"Somos guardianes");
       
        Personaje per1 = new Personaje(casa1);
        Personaje per4 = new Personaje(casa1);
        Personaje per2 = new Personaje(casa2);
        Personaje per3 = new Personaje(casa3);
        
        //casa1.agregarMiembro(per1);
        casa1.agregarMiembro(per4);
        Disipado personalidadAsesino = new Disipado(10);
        Conspiracion cons = new Conspiracion(per1);
        per4.setPersonalidad(personalidadAsesino);
        cons.agregarComplotado(per4);
        cons.realizarComplotTotal();
        per1.setEstadoDeVida(false);
        cons.realizarComplotTotal();
        per1.agregarConyugue(per4);
        per1.agregarConyugue(per4);
        
        System.out.println("hola");
        
    }
    
}
