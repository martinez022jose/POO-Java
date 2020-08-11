/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.List;
import java.util.Scanner;
import Alumno.*;
import java.util.ArrayList;
import java.util.Comparator;

/**
 *
 * @author Jose
 */
public class Main {
    
    static void ordenarListaPorEdad(List<Alumno> alumnos){
        System.out.println("Lista ordenada por edad");
        alumnos.sort(Comparator.comparing(Alumno::getEdad).reversed());
    }
    
    static void listarElementos(List<Alumno> alumnos){
        for(int i = 0;i<alumnos.size();i++){
            System.out.println(alumnos.get(i).toString());
        }
    }
    
    static void pedirNotas(Scanner escaner,List<Integer> notas){
        for (Integer nota : notas) {
            int notaAux = escaner.nextInt();
            notas.add(notaAux);
        }
        
    }
    
    static void pedirRegistro(String nombre,int edad,String apodo,List<Integer> notas,List<Alumno> alumnos,Scanner escaner,int totalDeRegistros,int totalNotas){
        for(int i = 0;i<totalDeRegistros;i++){
            escaner.nextLine();
            System.out.println("Ingrese Nombre");
            nombre = escaner.nextLine();
            System.out.println("Ingrese edad");
            edad = escaner.nextInt();
            escaner.nextLine();
            System.out.println("apodo");
            apodo = escaner.nextLine();
            System.out.println("Ingrese Notas");
            for(int j = 0;j<totalNotas;j++){
                int nota = escaner.nextInt();
                notas.add(nota);
            }
            alumnos.add(new Alumno(nombre,edad,apodo,notas));
        }
    }
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int totalDeRegistros = 0;
        int totalNotas = 0;
        String nombre = "";
        int edad = 0;
        String apodo = "";
        List<Integer> notas = new ArrayList<>();
        List<Alumno> alumnos = new ArrayList<>();
        Scanner escaner = new Scanner(System.in);
        System.out.println("Cuantos registros desea ingresar");
        totalDeRegistros = escaner.nextInt();
        System.out.println("Cantidad de notas a registrar");
        totalNotas = escaner.nextInt();
        
        pedirRegistro( nombre,edad, apodo, notas,alumnos, escaner, totalDeRegistros, totalNotas);
        
        System.out.println("Lista de registros");
        listarElementos(alumnos);
        
        ordenarListaPorEdad(alumnos);
        
        listarElementos(alumnos);
        
        System.out.println("El que tiene mayor edad");
        System.out.println(alumnos.get(0));
        
        System.out.println("El que tiene menos edad");
        System.out.println(alumnos.get((alumnos.size())-1));
        
    }
    
}
