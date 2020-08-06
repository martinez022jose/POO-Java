/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Minion;

import java.util.List;
import Arma.*;
import java.util.ArrayList;
/**
 *
 * @author Jose
 */
public class Minion{
    private boolean esAmarillo;
    private int bananas;
    private List<Arma> armas = null;
    private int totalPotencia;
    
    public Minion(int bananas){
        this.bananas = bananas;
        this.armas = new ArrayList<>();
        this.esAmarillo = true;
        
    }
    
    public int getBananas(){
        return this.bananas;
    }
    
    public void agregarArma(Arma arma){
        this.armas.add(arma);
    }
    
    public void alimentarMinion(int bananas){
        this.bananas += bananas;
    }
    
    public int totalPotencia(){
        this.armas.forEach((arma)->{
        this.totalPotencia+=arma.getPotencia();
        });
        return this.totalPotencia;
        
    }
    
    public int nivelDeConcetracion(){
        if(this.esAmarillo){
            return this.totalPotencia() + this.bananas;
        }else{
            return this.bananas;
        }
    }
    public boolean esPeligroso(){
        if(this.esAmarillo){
            return this.armas.size()>2;
        }else{
            return true;
        }
    }
    
    public void tomarPosima(){
        this.definirTipoDeMinion();
    }
    
    public void definirTipoDeMinion(){
        if(!this.esAmarillo){
            this.bananas-=1;
            this.esAmarillo = true;
        }else{
            this.armas.clear();
            this.bananas = 1;
            this.esAmarillo = false;
        }
    }
    
    
}
