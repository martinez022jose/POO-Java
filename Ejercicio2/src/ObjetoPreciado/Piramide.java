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
public class Piramide extends ObjetoPreciado{
    private int altura;
    private String nombre;
    
    public Piramide(String nombre,int altura){
        this.nombre = nombre;
        this.altura = altura;
    }
    
    @Override
    public void efectosDeRobo(Villano villano){
        this.minionsRequeridos(villano.getEjercitoMinion()).forEach((minion)->{
           minion.setBananas(minion.getBananas() + 10);
        });
        villano.getCiudad().eliminarObjetoPreciado(this);
    }
  
    public List<Minion> minionsRequeridos(List<Minion> minions){
        List<Minion> miniosRequeridos = new ArrayList<>();
        minions.forEach((minion)->{
            if(minion.esPeligroso() && minion.nivelDeConcetracion() < this.altura/2){
                miniosRequeridos.add(minion);
            }
        });
        return miniosRequeridos;
    }

    @Override
    public String toString() {
        return "Piramide{" + "altura=" + this.altura + ", nombre=" + this.nombre + '}';
    }
    
    
    
}
