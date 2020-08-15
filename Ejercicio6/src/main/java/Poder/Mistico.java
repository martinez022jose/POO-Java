/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Poder;

import Individuo.Comun;
import Individuo.Heroe;
import Individuo.Individuo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jose
 */
public class Mistico extends Poder{
    private List<Poder> poderesAcumulados;

    public Mistico(){
        this.poderesAcumulados = new ArrayList<>();
    }
    
    public List<Poder> getPoderesAcumulados(){
        return this.poderesAcumulados;
    }
    
    public void agregarPoder(Poder poder){
        this.poderesAcumulados.add(poder);
    }
    
    public int totalPoderesAcumulados(){
        return this.poderesAcumulados.stream().mapToInt(poder->poder.otorgaPotencia()).sum();
    }
    
    @Override
    public int otorgaPotencia(){
        return this.totalPoderesAcumulados();
    }
    
    @Override 
    public void incrementarRespecto(Individuo otro){
        if(Comun.class.isInstance(otro)){
            this.poderesAcumulados.add(new SuperFuerza(5));
        }
        if(Heroe.class.isInstance(otro)){
            this.poderesAcumulados.add(new Sabiduria(10));
        }
    }
}
