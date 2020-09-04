/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Individuo;

import Arma.*;
import Poder.*;

//import org.junit.After;
//import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
//import Poder.SuperFuerza;
//import org.junit.BeforeClass;
import org.junit.Test;
//import static org.junit.Assert.*;

/**
 *
 * @author Jose
 */
public class TestHeroe {
    private Heroe heroe;
    private Heroe heroe2;
    private Heroe heroeSuper;
    private SuperFuerza superFuerza;
    private SuperFuerza superFuerza2;
    private Arma arma1;
    private Arma arma2;
    private Arma arma3;
    
    @Before
    public void init(){
        superFuerza2 = new SuperFuerza(10);
        superFuerza = new SuperFuerza(5);
        heroe = new Heroe(10, superFuerza);
        heroe2 = new Heroe(20,superFuerza);
        heroeSuper = new Heroe(30,superFuerza2);
        arma1 = new Arma(10);
        arma2 = new Arma(20);
        arma3 = new Arma(40);
    }
    
    @Test
    public void calculaGetPotenciaCorrectamenteSinArmas(){
        Assert.assertEquals(15,heroe.getPotencia());
    }
    
    @Test
    public void calculaGetPotenciaCorrectamenteConArmas(){
        heroe.agregarArma(arma1);
        heroe.agregarArma(arma2);
        heroe.agregarArma(arma3);
        Assert.assertEquals(55,heroe.getPotencia());
    }
    
    @Test
    public void noEsDeConfianza(){
        heroe.agregarArma(arma1);
        heroe.agregarArma(arma2);
        heroe.agregarArma(arma3);
        Assert.assertFalse(heroe.esDeConfianza());
    }
    
    @Test
    public void agregadoDeHistorialNoPermiteRepetidos(){
        heroe.agregarAlHistorial(heroe2);
        heroe.agregarAlHistorial(heroe2);
        Assert.assertTrue(heroe.getHistorial().size() == 1);
    }
    
    @Test
    public void ganaPeleaYIncrementaPotenciaDeArma(){
        heroeSuper.ganaPeleaContra(heroe);
        Assert.assertTrue(superFuerza2.getPotencia() == 11);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
