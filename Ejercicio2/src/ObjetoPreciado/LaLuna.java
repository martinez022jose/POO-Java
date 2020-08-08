/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjetoPreciado;

import Arma.*;
import Minion.*;
import java.util.ArrayList;
import java.util.List;
import Villano.*;
/**
 *
 * @author Jose
 */
public class LaLuna extends ObjetoPreciado{
    private String nombre= "";
    public LaLuna(String nombre){
        this.nombre = nombre;
    }
    
    
    @Override
    public void efectosDeRobo(Villano villano){
        Arma arm = new Arma("Rayo congelante",10);
        this.minionsNecesarios(villano.getEjercitoMinion()).forEach((minion)->{
            minion.agregarArma(arm);
        });
        villano.getCiudad().eliminarObjetoPreciado(this);
    }
    
    @Override
    public List<Minion> minionsNecesarios(List<Minion> minions){
        List<Minion> miniosRequeridos = new ArrayList<>();
        minions.forEach((minion)->{
            if( minion.esPeligroso() && minion.tieneRayoEncogedor()){
                miniosRequeridos.add(minion);
            }
        });
        return miniosRequeridos;
    }

    @Override
    public String toString() {
        return "LaLuna{" + "nombre=" + this.nombre + '}';
    }
    
    
    
    
}
