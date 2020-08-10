/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Legion;

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
    
    public Legion(List<Ninio> miembros){
        if(miembros.size()>2){
            this.miembros.addAll(miembros);
        }
    }
    
    public void agregarMiembro(Ninio miembro){
        this.miembros.add(miembro);
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
}
