/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adulto;

import CustomException.CustomException;
import Ninio.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Jose
 */
public class Comun extends Adulto{
    private int tolerancia = 0;
    private List<Ninio> niniosQueLoAsustaron = null;
    
    public Comun(){
        this.niniosQueLoAsustaron = new ArrayList<>();
    }
    
    public void setTolerancia(int nuevaTolerancia){
        this.tolerancia = nuevaTolerancia;
    }
    
    public void agregarNinioQueLoAsusto(Ninio ninio){
        try{
            if(this.niniosQueLoAsustaron.contains(ninio)){
                throw new CustomException("El ninio: "+ninio+" ya se encuentra en la lista");
            }else{
                this.niniosQueLoAsustaron.add(ninio);
            }
        }catch(CustomException e){
            System.out.println(e.getMessage());
        }
    }
    
    public int getTolerancia(){
        return 10*this.niniosQueLoAsustaron.stream().filter(e->e.getCantidadDeCaramelos() > 15).collect(Collectors.toList()).size();
    }
    
    
    @Override
    public boolean seAsustaDe(Ninio ninio){
        return this.getTolerancia() < ninio.capacidadDeSusto();
    }
    
    @Override
    public int darCaramelosA(Ninio ninio){
        return this.getTolerancia()/2;
    }
    
    
}
