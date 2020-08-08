/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Maldad;
import Minion.Minion;
import Villano.*;
import ObjetoPreciado.*;
import java.util.List;

/**
 *
 * @author Jose
 */
public class Robar extends Maldad{
    private ObjetoPreciado obj;
   
    public Robar(ObjetoPreciado obj){
        this.obj = obj;
    }
    
    @Override
    public List<Minion> minionsRequeridos(List<Minion> minions){
        return this.obj.minionsNecesarios(minions);
    }
    
    @Override
    public void ejecutarMaldad(Villano villano){
        this.obj.efectosDeRobo(villano);
    }
}
