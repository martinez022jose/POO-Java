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
    
    public void agregarMinion(Minion min){
        try{
            if(this.ejercitoMinion.contains(min)){
            throw new ExceptionPersonalizada("Dicho minion ya se encuentra en el ejercito de minions"+ min.toString());
        }else{
            this.ejercitoMinion.add(min);
        }
    
        }catch(ExceptionPersonalizada e){
            System.out.println(e.getMessage());
        }
    }
    public void contarMision(Maldad maldad){
       maldad.minionsRequeridos(this.ejercitoMinion).forEach((minion)->{
           minion.setCantidadMisiones(minion.getCantidadMisiones() + 1);   
       });
    }
    
    public Minion conMasCantidadDeMisiones(){
        Minion mayor = this.ejercitoMinion.get(0);
        this.maldadesRealizadas.forEach((maldad)->{
                this.contarMision(maldad);
                this.ejercitoMinion.forEach((minion)->{
                    if(minion.getCantidadMisiones() > mayor.getCantidadMisiones()){
                        mayor = minion;
                    }
                });
        });
        
        return mayor;
                
                
    }
  
    public Minion minionMasUtilizado(){
        Minion masUtilizado = this.ejercitoMinion.get(0);
        this.maldadesRealizadas.forEach(maldad->{
            this.contarMision(maldad);
            this.ejercitoMinion.forEach((minion) -> {
                if(minion.getCantidadMisiones() > masUtilizado.getCantidadMisiones()){
                    masUtilizado =  minion;
                }
            });
                    
        });
        return masUtilizado;
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
       this.maldadesRealizadas.add(maldad);
    }

    @Override
    public String toString() {
        return "Villano{" + "ciudad=" + ciudad + ", ejercitoMinion=" + ejercitoMinion + ", maldadesRealizadas=" + maldadesRealizadas + '}';
    }
    
}
