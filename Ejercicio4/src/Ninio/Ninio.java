/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ninio;

import Adulto.Adulto;
import CustomException.CustomException;
import Elementos.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Jose
 */
public class Ninio {
    private int actitud;
    private int cantidadCarmelos;
    private List<Elemento> elementos;
    private boolean estaSaludable;
    
    public Ninio(int actitud,int cantidadCaramelos){
        this.actitud = actitud;
        this.cantidadCarmelos = cantidadCaramelos;
        this.elementos = new ArrayList<>();
        this.estaSaludable = true;
    }
    
    public List<Elemento> getElementos(){
        return this.elementos;
    }
    
    public void agregarElemento(Elemento element){
        try{
            if(this.elementos.contains(element)){
                throw new CustomException("El elemento: "+element+"ya se encuentra en la lista");
            }else{
                this.elementos.add(element);
            }
        }catch(CustomException e){
            System.out.println(e.getMessage());
        }
    }
    
    public int getCantidadDeCaramelos(){
        return this.cantidadCarmelos;
    }
    
    public void empachar(){
        this.incrementarCaramelos(10);
        this.estaSaludable = false;
        this.actitud/=2;
        
    }
    
    public boolean estaEmpachado(){
        return this.estaSaludable;
    }
    
    public void incrementarCaramelos(int cantidad){
        this.cantidadCarmelos+=cantidad;
    }
    
    public void descartarCaramelos(int caramelos){
        try{
            if(this.cantidadCarmelos < caramelos){
                this.cantidadCarmelos-=caramelos;
            }else{
                throw new CustomException("No posee caramelos necesarios");
            }
        }catch(CustomException e){
            System.out.println(e.getMessage());
        }
        
    }
    
    public int capacidadDeSusto(){
        return this.elementos.stream().mapToInt(e->e.nivelSusto()).sum() * this.actitud;
    }
    
    public void asustarA(Adulto adulto){
        try{
            if(this.estaSaludable && adulto.seAsustaDe(this)){
                this.incrementarCaramelos(adulto.darCaramelosA(this));
            }else{
                throw new CustomException("El niño esta en cama, no puede asustar por ahora");
            }
        }catch(CustomException e){
            System.out.println(e.getMessage());
        }
    }
    
    public void comerCaramelos(int caramelos){
        try{
            if(this.cantidadCarmelos < caramelos){
                throw new CustomException("No tiene esta cantidad de caramelos para comer: "+caramelos);
            }else{
                this.descartarCaramelos(caramelos);
            }
        }catch(CustomException e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public String toString() {
        return "Ninio{" + "actitud=" + actitud + ", cantidadCarmelos=" + cantidadCarmelos + ", elementos=" + elementos + '}';
    }
    
}