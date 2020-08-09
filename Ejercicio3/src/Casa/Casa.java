/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Casa;

import ManejoDeErrores.CustomException;
import Personaje.Personaje;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jose
 */
public abstract class Casa {
    private double patrimonio;
    private String nombreCiudad;
    private List<Personaje> miembros;
    
     public Casa(int patrimonio,String nombreCiudad){
        this.patrimonio = patrimonio;
        this.nombreCiudad = nombreCiudad;
        this.miembros = new ArrayList<>();
    }

    @Override
    public String toString() {
        return "Casa{" + "patrimonio=" + this.patrimonio + ", nombreCiudad=" + this.nombreCiudad + ", miembros=" + this.miembros + '}';
    }
   
    public void agregarMiembro(Personaje per){
        try{
            if(this.miembros.contains(per)){
                throw new CustomException("El miembro que desea ingresa ya esta en la lista: "+per.toString());
            }else{
                this.miembros.add(per);
            }
        }catch(CustomException e){
            System.out.println(e.getMessage());
        }
    }
    
    public List<Personaje> getMiembros(){
        return this.miembros;
    }
    
    public void setPatrimonio(double patrimonio){
        this.patrimonio = patrimonio;
    }
    
    public String getNombreCiudad(){
        return this.nombreCiudad;
    }
    
    public double getPatrimonio(){
        return this.patrimonio;
    }
    
    public boolean esRica(){
        return this.patrimonio > 1000;
    }
    
    public abstract boolean permiteMatrimonioEntre(Personaje per1,Personaje per2);
}
