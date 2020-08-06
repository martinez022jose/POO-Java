/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Villano;
import Minion.*;
import Arma.*;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author Jose
 */
public class Villano {
    private List<Minion> ejercitoMinion = null;
    
    public Villano(){
        this.ejercitoMinion = new ArrayList<>();
    }
    
    public void nuevoMinion(){
        Arma arma = new Arma("Congelante",10);
        Minion minion = new Minion(5);
        minion.agregarArma(arma);
        this.ejercitoMinion.add(minion);
    }
}
