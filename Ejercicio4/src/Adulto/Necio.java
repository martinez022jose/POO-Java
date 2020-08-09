/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adulto;

import Ninio.Ninio;

/**
 *
 * @author Jose
 */
public class Necio extends Adulto{
    
    public Necio(){
        
    }
    
    @Override
    public boolean seAsustaDe(Ninio ninio){
        return false;
    }
    
    @Override
    public int darCaramelosA(Ninio ninio){
        return 0;
    }
    
}
