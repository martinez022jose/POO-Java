/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ninio;

import Adulto.Adulto;
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
    
    public Ninio(int actitud,int cantidadCaramelos){
        this.actitud = actitud;
        this.cantidadCarmelos = cantidadCaramelos;
        this.elementos = new ArrayList<>();
    }
    
    public void agregarElemento(Elemento element){
        this.elementos.add(element);
    }
    
    public int getCantidadDeCaramelos(){
        return this.cantidadCarmelos;
    }
    
    public void incrementarCaramelos(int cantidad){
        this.cantidadCarmelos+=cantidad;
    }
    
    public int capacidadDeSusto(){
        return this.elementos.stream().mapToInt(e->e.nivelSusto()).sum() * this.actitud;
    }
    
    public void asustarA(Adulto adulto){
        if(adulto.seAsustaDe(this)){
            this.incrementarCaramelos(adulto.darCaramelosA(this));
        }
    }
}