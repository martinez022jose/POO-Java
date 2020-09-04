/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Individuo;

import Arma.*;
import CustomException.CustomException;
import Poder.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Jose
 */
public abstract class Individuo {
    private int nivelDeEntrenamiento;
    private List<Arma> armas;
    private List<Individuo> historialVictorias;
    private int potencia;
    
    
    public Individuo(int nivelDeEntrenamiento){
        this.nivelDeEntrenamiento = nivelDeEntrenamiento;
        this.armas = new ArrayList<>();
        this.historialVictorias = new ArrayList<>();
        
    }
    
    public void agregarAlHistorial(Individuo individuo){
        try{
            if(this.historialVictorias.contains(individuo)){
                throw new CustomException("El elemento: "+individuo+" ya se encuentra en la lista");
            }else{
                this.historialVictorias.add(individuo);
            }
        }catch(CustomException e){
            System.out.println(e.getMessage());
        }
    }
    
    public List<Individuo> getHistorial(){
        return this.historialVictorias;
    }
    
    public Individuo enfrentamientoMasDuro(){
        this.historialVictorias.sort(Comparator.comparing(Individuo::getPotencia).reversed());
        return this.historialVictorias.get(0);
    }
    
    public void incrementarNivelDeEntrenamiento(){
        try{
            if(this.nivelDeEntrenamiento < 1000){
                this.nivelDeEntrenamiento+=1;
            }else{
                throw new CustomException("Se supero el limite de aumento con respecto al nivel de entrenamiento");
            }
        }catch(CustomException e){
            System.out.println(e.getMessage());
        }
    }
        
    
    public int getNivelDeEntrenamiento(){
        return this.nivelDeEntrenamiento;
    }
    
    public void setNivelDeEntrenamiento(int nivelNuevo){
        this.nivelDeEntrenamiento = nivelNuevo;
    }
    
    public List<Arma> getArmas(){
        return this.armas;
    }
    
    public void iniciarArmas(){
        this.armas = new ArrayList<>();
    }
    
    public void agregarArma(Arma arma){
        try{
            if(this.armas.contains(arma)){
                throw new CustomException("El arma ya pertenece a dicha lista");
            }else{
                this.armas.add(arma);
            }
        }catch(CustomException e){
            System.out.println(e.getMessage());
        }
    }
    
    public void setPotencia(int potencia){
        this.potencia = potencia;
    }
    
    public boolean esDeConfianza(){
        return this.getHistorial().size() > 10 && this.getNivelDeEntrenamiento() < 1000;
    }
    
    public int getpotenciaMasAlta(){
        if(this.armas.isEmpty()){
            return 0;
        }else{
             return this.armas.stream().mapToInt(arma->arma.getPotencia()).max().getAsInt();
        }
    }
    
    public abstract void  ganaPeleaContra(Individuo otro);
    
    public abstract int getPotencia();
     
    
   
}
