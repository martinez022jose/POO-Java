/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Individuo;

import Arma.*;
import Poder.Mistico;
import Poder.Sabiduria;
import Poder.SuperFuerza;

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
    private Heroe heroe3;
    private SuperFuerza superFuerza;
    private SuperFuerza superFuerza2;
    private Mistico mistico;
    private Arma arma1;
    private Arma arma2;
    private Arma arma3;
    
    @Before
    public void init(){
        //instanciamos poderes
        superFuerza = new SuperFuerza(10);
        superFuerza2 = new SuperFuerza(5);
        mistico= new Mistico();
        
        //Instanciamos Personajes
        heroe = new Heroe(10,superFuerza2 );
        heroe2 = new Heroe(20,superFuerza );
        heroe3 = new Heroe(30,superFuerza );
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
        heroe3.ganaPeleaContra(heroe);
        Assert.assertTrue(heroe3.getPoder().getPotencia() == 11);  
    }
    
    @Test
    public void noEsDeConfianzaSegunPoder(){
        heroe3.setPoder(mistico);
        Assert.assertFalse(heroe3.esDeConfianza());
        
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
