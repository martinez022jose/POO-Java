/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inmueble;

/**
 *
 * @author Jose
 */
public class Zona {
    
    private String nombreZona = "";
    private double plus = 0.0;
    
    public Zona(String nombreZona,double plus){
        this.nombreZona = nombreZona;
        this.plus = plus;
    }
    
    public double getPlus(){
        return this.plus;
    }
    
    public void setPlus(double plus){
        this.plus = plus;
    }
    
    public String nombreZona(){
        return this.nombreZona;
    }
    
    public void setNombreZona(String nombreZona){
        this.nombreZona = nombreZona;
    }
    
    
}
