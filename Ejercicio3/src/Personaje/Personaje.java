/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personaje;

import java.util.ArrayList;
import java.util.List;
import Casa.*;
import ManejoDeErrores.CustomException;
import java.util.HashMap;
import java.util.stream.Collectors;

/**
 *
 * @author Jose
 */
public class Personaje {
    private Casa casa;
    private List<Personaje> conyugues;
    private List<Personaje> acompaniantes;
    private boolean estaVivo;
    private int oroAliados;
    
    public Personaje(Casa casa){
        this.estaVivo = true;
        this.casa = casa;
        this.conyugues = new ArrayList<>();
        this.acompaniantes= new ArrayList<>();
    }
    
    public List<Personaje> getConyugues(){
        return this.conyugues;
    }
    
    public void agregarConyugue(Personaje conyugue){
        this.conyugues.add(conyugue);
    }
    
    public int oroTotalAliados(){
        this.getAliados().forEach((aliado)->{
           this.oroAliados += aliado.getCasa().getPatrimonio();
        });
        return this.oroAliados;
    }
    
    public void agregarAcompaniante(Personaje per){
        this.acompaniantes.add(per);
    }
    
    public boolean estaSolo(){
        return this.acompaniantes.isEmpty();
    }
    
    public boolean sonTodosConyuguesDeCasaRica(){  
        return !this.conyugues.stream().map(e->e.casa).collect(Collectors.toList()).stream().map(c->c.esRica()).collect(Collectors.toList()).contains(false);
    }
    
    //public boolean esPeligroso(){
       // return this.estaVivo && (this.oroTotalAliados() >= 10000 ||) 
   // }
    
    public List<Personaje> getAliados(){
        List<Personaje> aliados = new ArrayList<>();
        aliados.addAll(this.acompaniantes);
        aliados.addAll(this.conyugues);
        aliados.addAll(casa.getMiembros());
        aliados = aliados.stream().distinct().collect(Collectors.toList());
        return aliados;
    }
    
    public void casarseCon(Personaje conyugue){
        try{
            if(this.puedeCasarseCon(conyugue)){
                this.agregarConyugue(conyugue);
                conyugue.agregarConyugue(this);
         
            }
            else{
                throw new CustomException("No pude casarse con: "+ conyugue.toString());
            }
        }catch(CustomException e){
            System.out.println(e.getMessage());   
        }
    }
  
    public double patrimonioTotal(){
        return casa.getPatrimonio() + casa.getMiembros().size();
    }
    
    public Casa getCasa(){
        return this.casa;
    }

    public boolean puedeCasarseCon(Personaje otra){
        return this.casa.permiteMatrimonioEntre(this, otra);
    }
    
   
}
