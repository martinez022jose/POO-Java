/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Maldad;

import Villano.*;
import Minion.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Jose
 */
public class Congelar extends Maldad{
    
    public List<Minion> minionsRequeridos(List<Minion> minions){
        List<Minion> ejercitoNecesario = new ArrayList<>();
        minions.forEach((minion)->{
            if(minion.tieneRayoCongelante() && minion.nivelDeConcetracion() <500){
                ejercitoNecesario.add(minion);
            }
        });
        return ejercitoNecesario;
    }
    
    
    @Override
    public void ejecutarMaldad(Villano villano){
        int temperaturaCiudad = villano.getCiudad().getTemperatura() - 30;
        villano.getCiudad().setTemperatura(temperaturaCiudad);
        this.minionsRequeridos(villano.getEjercitoMinion()).forEach((minion)->{
            int bananasTotales = minion.getBananas() + 10;
            minion.setBananas(bananasTotales);
        });
    }
}
