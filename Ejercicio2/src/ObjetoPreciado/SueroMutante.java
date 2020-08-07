/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjetoPreciado;

import Minion.Minion;
import Villano.Villano;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jose
 */
public class SueroMutante extends ObjetoPreciado{
    private String nombre;
    public SueroMutante(String nombre){
        this.nombre = nombre;
    }
    
    @Override
    public void efectosDeRobo(Villano villano){
        this.minionsRequeridos(villano.getEjercitoMinion()).forEach((minion)->{
            minion.tomarPosima();
        });
        villano.getCiudad().getObjetosPreciados().remove(this);
    }
    
    public List<Minion> minionsRequeridos(List<Minion> minions){
        List<Minion> miniosRequeridos = new ArrayList<>();
        minions.forEach((minion)->{
            if( minion.esPeligroso() && minion.getBananas() > 100 && minion.nivelDeConcetracion() > 23){
                miniosRequeridos.add(minion);
            }
        });
        return miniosRequeridos;
    }

    @Override
    public String toString() {
        return "SueroMutante{" + "nombre=" + this.nombre + '}';
    }
    
    
    
    
}
