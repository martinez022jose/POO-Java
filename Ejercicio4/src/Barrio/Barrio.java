/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Barrio;

import Ninio.Ninio;
import java.util.ArrayList;
import java.util.List;
import CustomException.*;
import Elementos.Elemento;
import java.util.Comparator;
import java.util.stream.Collectors;
/**
 *
 * @author Jose
 */
public class Barrio {
    private List<Ninio> ninios;
    
    public Barrio(){
        this.ninios = new ArrayList<>();
    }
    
    public void agregarNinio(Ninio ninio){
        try{
            if(this.ninios.contains(ninio)){
                throw new CustomException("El ninio: "+ ninio +"ya se encuentra en la lista");
            }else{
                this.ninios.add(ninio);
            }
        }catch(CustomException e){
            System.out.println(e.getMessage());
        }
    }
    
    public List<Ninio> listarNiniosConMasCaramelos(){
        List<Ninio> niniosConMasCaramelos = new ArrayList<>();
        this.ninios.sort(Comparator.comparing(Ninio::getCantidadDeCaramelos).reversed());
        niniosConMasCaramelos.add(this.ninios.get(0));
        niniosConMasCaramelos.add(this.ninios.get(1));
        niniosConMasCaramelos.add(this.ninios.get(2));
        return niniosConMasCaramelos;
    } 
    
    public List<Elemento> elementosDeNinios(){
        List<Elemento> elementosSinRepetir = new ArrayList<>();
        this.ninios.forEach((elemento)->{
            if(elemento.getCantidadDeCaramelos() > 10){
                elementosSinRepetir.addAll(elemento.getElementos());
            }
        });
        return elementosSinRepetir.stream().distinct().collect(Collectors.toList());
    }
}
