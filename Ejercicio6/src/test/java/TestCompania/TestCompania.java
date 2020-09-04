/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestCompania;

import Compania.Compania;
import Individuo.*;
import Poder.SuperFuerza;
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
public class TestCompania {
    private Compania comp;
    private Heroe heroe;
    private Heroe heroe2;
    private SuperFuerza superFuerza;
    

    @Before
    public void init(){
        comp = new Compania();
        heroe = new Heroe(10, superFuerza);
        heroe2 = new Heroe(20,superFuerza);
    } 
    
    @Test
    public void agregaEmpeladoCorrectamente(){
        comp.agregarEmpleado(heroe);
        Assert.assertTrue(comp.getEmpleados().size() == 1);
    }
    
    @Test
    public void noAgregaRepetidos(){
        comp.agregarEmpleado(heroe);
        comp.agregarEmpleado(heroe);
        Assert.assertTrue(comp.getEmpleados().size() == 1);
    }
    
    @Test
    public void eliminaCorrectamenteEmpleado(){
        comp.agregarEmpleado(heroe);
        comp.eliminarEmpleado(heroe);
        Assert.assertTrue(comp.getEmpleados().isEmpty());
    }
}

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

