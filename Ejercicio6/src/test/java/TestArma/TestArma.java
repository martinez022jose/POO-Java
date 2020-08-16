/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestArma;


import Arma.Arma;
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
public class TestArma {
    private Arma arma1;
    
    @Before
    public void init() {
        arma1 = new Arma(5);
    }
    
    @Test
    public void devuelvePotencia(){
        Assert.assertEquals(5,arma1.getPotencia(),0.01);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
