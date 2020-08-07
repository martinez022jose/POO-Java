/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Villano;
import Minion.*;
import Arma.*;
import Maldad.*;
import Ciudad.*;
import java.util.List;
import java.util.ArrayList;
import ExceptionPersonalizada.*;

/**
 *
 * @author Jose
 */
public class Villano {
    private Ciudad ciudad;
    private List<Minion> ejercitoMinion = null;
    private List<Maldad> maldadesRealizadas = null;
    
    public Villano(Ciudad ciudad){
        this.ejercitoMinion = new ArrayList<>();
        this.maldadesRealizadas = new ArrayList<>();
        this.ciudad = ciudad;
    }
    
    public void agregarMinion(Minion min) throws ExceptionPersonalizada{
        if(this.ejercitoMinion.contains(min)){
            throw new ExceptionPersonalizada("Dicho minion ya se encuentra en el ejercito de minions");
        }else{
            this.ejercitoMinion.add(min);
        }
    
    }
    public void nuevoMinion(){
        Arma arma = new Arma("Congelante",10);
        Minion minion = new Minion(5);
        minion.agregarArma(arma);
        this.ejercitoMinion.add(minion);
    }
    
    public Ciudad getCiudad(){
        return this.ciudad;
    }
    
    public List<Minion> getEjercitoMinion(){
        return this.ejercitoMinion;
    }
   
    public void realizarMaldad(Maldad maldad){
       maldad.ejecutarMaldad(this);
    }

    @Override
    public String toString() {
        return "Villano{" + "ciudad=" + ciudad + ", ejercitoMinion=" + ejercitoMinion + ", maldadesRealizadas=" + maldadesRealizadas + '}';
    }
    
}
