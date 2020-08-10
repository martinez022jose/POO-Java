/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Legion;

import Adulto.Adulto;
import CustomException.CustomException;
import Ninio.Ninio;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Jose
 */
public class Legion {
    private List<Ninio> miembros = new ArrayList<>();
    private List<Legion> legionesAliadas;
    
    public Legion(List<Ninio> miembros){
        try{
            if(miembros.size()>2){
                this.miembros.addAll(miembros);
                this.legionesAliadas = new ArrayList<>();
            }else{
                throw new CustomException("No tiene cantidad minima de miembros");
            }
        }catch(CustomException e){
            System.out.println(e.getMessage());
        }
    }
    
    public void agregarMiembro(Ninio miembro){
        try{
            if(this.miembros.contains(miembro)){
                throw new CustomException("El elemento: "+miembro+" ya se encuentra en la lista");
            }else{
                this.miembros.add(miembro);
            }
        }catch(CustomException e){
            System.out.println(e.getMessage());
        }
    }
    
    public List<Ninio> getMiembros(){
        return this.miembros;
    }
    
    public int totalCapacidadSusto(){
        return this.miembros.stream().mapToInt(m->m.capacidadDeSusto()).sum();
    }
    
    public int totalCaramelos(){
        return this.miembros.stream().mapToInt(m->m.getCantidadDeCaramelos()).sum();
    }
    
    public Ninio getLider(){
        this.miembros.sort(Comparator.comparing(Ninio::capacidadDeSusto).reversed());
        return this.miembros.get(0);
    }
    
    public void asustarA(Adulto adulto){
        this.miembros.forEach((miembro)->{
            miembro.asustarA(adulto);
        });
    }
}
