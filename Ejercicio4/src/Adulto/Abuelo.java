/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adulto;

import Elementos.Susto;
import Ninio.Ninio;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Jose
 */
public class Abuelo extends Adulto{
    private List<Ninio> niniosQueLoAsustaron = null;
    
    public Abuelo(){
        this.niniosQueLoAsustaron = new ArrayList<>();
    }
    
    public int getTolerancia(){
        return (10*this.niniosQueLoAsustaron.stream().filter(e->e.getCantidadDeCaramelos() > 15).collect(Collectors.toList()).size())/2;
    }
    
    @Override
    public boolean seAsustaDe(Ninio ninio){
        return true;
    }
    
    @Override
    public int darCaramelosA(Ninio ninio){
        return this.getTolerancia()/2;
    }
    
}
