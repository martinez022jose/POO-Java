/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Maldad;
import Minion.Minion;
import Villano.*;
import java.util.List;
/**
 *
 * @author Jose
 */
public abstract class Maldad {
    
    public abstract List<Minion> minionsRequeridos(List<Minion> minios);
    
    public abstract void ejecutarMaldad(Villano villano);
}
