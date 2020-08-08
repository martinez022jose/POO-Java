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

/**
 *
 * @author Jose
 */
public class Personaje {
    private Casa casa;
    private List<Personaje> conyugues;
    
    public Personaje(Casa casa){
        this.casa = casa;
        this.conyugues = new ArrayList<>();
    }
    
    public List<Personaje> getConyugues(){
        return this.conyugues;
    }
    
    public void agregarConyugue(Personaje conyugue){
        this.conyugues.add(conyugue);
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
