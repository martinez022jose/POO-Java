/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Individuo;

import Arma.Arma;
import CustomException.CustomException;
//import junit.framework.Assert;
//import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jose
 */
public class TestComun {
    
    private Comun individuo;
    private Arma arma1;
    private Arma arma2;
    private Arma arma3;
    
    @Before
    public void init() {
        individuo = new Comun(10);
        arma1 = new Arma(10);
        arma2 = new Arma(20);
        arma3 = new Arma(40);
    }
    
    @Test
    public void calculoCorrectoDePotencia(){
        individuo.agregarArma(arma1);
        Assert.assertEquals(20,individuo.getPotencia());
    }
    
    @Test
    public void calculoCorrectoDePotenciaDeNArmas(){
        individuo.agregarArma(arma1);
        individuo.agregarArma(arma2);
        individuo.agregarArma(arma3);
        Assert.assertEquals(50,individuo.getPotencia());
    }
    
    @Test
    public void agregaCorrectamenteArmas(){
        individuo.agregarArma(arma1);
        individuo.agregarArma(arma2);
        individuo.agregarArma(arma3);
        Assert.assertEquals(3,individuo.getArmas().size());
    }
    
    @Test
    public void noAgregaArmasRepetidas(){
        individuo.agregarArma(arma1);
        individuo.agregarArma(arma2);
        individuo.agregarArma(arma3);
        individuo.agregarArma(arma3);
        individuo.agregarArma(arma3);
        Assert.assertEquals(3,individuo.getArmas().size());
    }
    
    
    @Test
    public void noEsDeConfianza(){
        individuo.agregarArma(arma1);
        individuo.agregarArma(arma2);
        individuo.agregarArma(arma3);
        Assert.assertTrue(!individuo.esDeConfianza());
    }
    
    @Test
    public void puedoIncrementarNivelDeEntrenamiento(){
        individuo.incrementarNivelDeEntrenamiento();
        Assert.assertEquals(11,individuo.getNivelDeEntrenamiento());
    }
    
    @Test
    public void noPuedoIncrementarNivelDeEntrenamiento(){
        individuo.setNivelDeEntrenamiento(1000);
        individuo.incrementarNivelDeEntrenamiento();
        Assert.assertEquals(1000,individuo.getNivelDeEntrenamiento());
    }
    
    @Test
    public void devuelveCorrectamentePotenciaArmaMasLetal(){
        individuo.agregarArma(arma1);
        individuo.agregarArma(arma2);
        individuo.agregarArma(arma3);
        Assert.assertEquals(40,individuo.getpotenciaMasAlta());
    }
    
    

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
