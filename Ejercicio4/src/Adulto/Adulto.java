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
public abstract class Adulto implements Asustado{
    
    @Override
    public abstract boolean seAsustaDe(Ninio ninio);
    
    @Override
    public abstract int darCaramelosA(Ninio ninio);
}
