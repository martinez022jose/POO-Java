/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conspiracion;

import ManejoDeErrores.CustomException;
import Personaje.Personaje;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author Jose
 */
public class Conspiracion{
    private Personaje objetivo;
    private List<Personaje> complotados;
   
    public Conspiracion(Personaje objetivo){
        this.objetivo = objetivo;
        this.complotados = new ArrayList<>();
    }
    
    public List<Personaje> getComplotadores(){
        return this.complotados;
    }
    
    public void realizarComplotTotal(){
        try{
            if(this.objetivo.esPeligroso()){
                this.complotados.forEach((com)->{
                    com.actuarComoComplot(this.objetivo,this);});
            }else{
                throw new CustomException("El objetivo no es peligroso, no vale la pena");
            }
        }catch(CustomException e){
            System.out.println(e.getMessage());
        }
        
    }
    public void agregarComplotado(Personaje personaje){
        try{
            if(this.complotados.contains(personaje)){
                throw new CustomException("El persona que quiere agrega ya se encuentra en la cosnpiracion: "+personaje.toString());
            }else{
                this.complotados.add(personaje);
            }
        }catch(CustomException e){
            System.out.println(e.getMessage());
        }
        
    }
    
    public boolean estaComoAliado(Personaje objetico,Personaje complotador){
        return objetivo.getAliados().contains(complotador);
    }
    
    public int cantidadDeTraidores(){
        AtomicInteger totalComplotadores = new AtomicInteger(0);
        this.complotados.forEach((complotador)->{
           if(this.estaComoAliado(this.objetivo, complotador)){
               totalComplotadores.getAndIncrement();
           }
        });
        
        return totalComplotadores.get();
    }
    
    public boolean seCumplioConspiracion(){
        return !this.objetivo.esPeligroso();
    }
}
