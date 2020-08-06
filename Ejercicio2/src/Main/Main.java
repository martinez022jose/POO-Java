/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Arma.*;
import Minion.*;
import Villano.*;
import Ciudad.*;
import Maldad.*;
/**
 *
 * @author Jose
 */
public class Main {
    public static void main(String[] args) {
        Ciudad ciudad = new Ciudad(20);
        Villano villano = new Villano(ciudad);
        Minion min = new Minion(20);
        Minion min2 = new Minion(30);
        Arma arm1 = new Arma("Holas",10);
        Arma arm2 = new Arma("Como",20);
        Arma arm3 = new Arma("Rayo congelante",30);
        Congelar congelar = new Congelar();
        
        min.agregarArma(arm1);
        min.agregarArma(arm2);
        min.agregarArma(arm3);
        min2.agregarArma(arm3);
        villano.agregarMinion(min);
        villano.agregarMinion(min2);
        
        villano.realizarMaldad(congelar);
        
        System.out.println(villano.getEjercitoMinion());
    }
    
}
