/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Arma.*;
import Minion.*;
import Villano.*;
/**
 *
 * @author Jose
 */
public class Main {
    public static void main(String[] args) {
        Villano villano = new Villano();
        Minion min = new Minion(20);
        Arma arm1 = new Arma("Holas",10);
        
        min.agregarArma(arm1);
        min.alimentarMinion(10);
        min.tomarPosima();
        min.alimentarMinion(10);
        System.out.println(min.nivelDeConcetracion());
    }
    
}
