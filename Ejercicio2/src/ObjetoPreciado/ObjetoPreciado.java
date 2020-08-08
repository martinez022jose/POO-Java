/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjetoPreciado;



import Minion.Minion;
import Villano.*;
import java.util.List;
/**
 *
 * @author Jose
 */
public abstract class ObjetoPreciado {
  
    public abstract void efectosDeRobo(Villano villano);
    
    public abstract List<Minion> minionsNecesarios(List<Minion> minions);

   
}
