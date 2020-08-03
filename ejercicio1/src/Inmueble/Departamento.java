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
public class Departamento extends Inmueble{
    private int valorDepartamento = 0;
    
    public Departamento(int tamanio,int cantidadAmbientes,String tipoDeOperacion){
        super(tamanio,cantidadAmbientes,tipoDeOperacion);
        this.definirValorDepartamento();
    }
    
    public final void definirValorDepartamento(){
        this.valorDepartamento = 350000 * this.getCantidadAmbientes();
    }
    
    @Override
    public int valorInmueble(){
        return this.valorDepartamento;
    }
}
