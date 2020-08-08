/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Casa;
import Personaje.*;
/**
 *
 * @author Jose
 */
public class Stark extends Casa{
    
     public Stark(int patrimonio, String nombreCiudad){
        super(patrimonio, nombreCiudad);
        
    }
    
    @Override
    public boolean permiteMatrimonioEntre(Personaje per1,Personaje per2){
       return per1.getCasa() ==  per2.getCasa();
    }
}
