/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Casa;

import Personaje.Personaje;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jose
 */
public abstract class Casa {
    private int patrimonio;
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
        this.miembros.add(per);
    }
    
    public List<Personaje> getMiembros(){
        return this.miembros;
    }
    
    public String getNombreCiudad(){
        return this.nombreCiudad;
    }
    
    public int getPatrimonio(){
        return this.patrimonio;
    }
    
    public boolean esRica(){
        return this.patrimonio > 1000;
    }
    public abstract boolean permiteMatrimonioEntre(Personaje per1,Personaje per2);
}
