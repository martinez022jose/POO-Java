/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Alumno;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Jose
 */
public class Alumno {
    private String nombre;
    private int edad;
    private String apodo;
    private List<Integer> notas = new ArrayList<>();
    
    public Alumno(String nombre,int edad,String apodo,List<Integer> notas){
        this.nombre = nombre;
        this.edad = edad;
        this.apodo = apodo;
        this.notas = notas;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", edad=" + edad + ", apodo=" + apodo + ", notas=" + notas + "}";
    }
    
    public int getEdad(){
        return this.edad;
    }
    
    
}
