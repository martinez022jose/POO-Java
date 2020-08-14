/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Individuo;

import Arma.Arma;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 *
 * @author Jose
 */
public class Comun {
    private int nivelDeEntrenamiento;
    private List<Arma> armas;
    private int potencia;
    
    public Comun(){
        this.armas = new ArrayList<>();
    }
    public int definirPotencia(){
        return this.potencia = nivelDeEntrenamiento + this.potenciaDeArmasMasLetal();
    }
    
    public int getPotencia(){
        return this.definirPotencia();
    }
    
    public int potenciaDeArmasMasLetal(){
        return this.armas.stream().mapToInt(arma->arma.getPotencia()).max().getAsInt();
    }

    
}
