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
public abstract class Inmueble {
    private int tamanio = 0;
    private int cantidadAmbientes = 0;
    private String tipoDeOperacion = "";
    private Zona zona;
    
    public Inmueble(int tamanio,int cantidadAmbientes,String tipoDeOperacion,Zona zona){
        this.tamanio = tamanio;
        this.cantidadAmbientes = cantidadAmbientes;
        this.tipoDeOperacion = tipoDeOperacion;
        this.zona = zona;
    }
    
    public int getCantidadAmbientes(){
        return this.cantidadAmbientes;
    }
    
    public int getTamanio(){
        return this.tamanio;
    }
    
    public Zona getZona(){
        return this.zona;
    }
    
    public void setZona(Zona zona){
        this.zona = zona;
    }
 
    public abstract double valorInmueble();
    
}

