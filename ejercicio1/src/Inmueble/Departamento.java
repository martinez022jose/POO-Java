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
    private double valorDepartamento = 0;
    
    public Departamento(int tamanio,int cantidadAmbientes,String tipoDeOperacion,Zona zona){
        super(tamanio,cantidadAmbientes,tipoDeOperacion,zona);
        this.definirValorDepartamento();
    }
    
    public final void definirValorDepartamento(){
        this.valorDepartamento = 350000 * this.getCantidadAmbientes();
    }
    
    @Override
    public double valorInmueble(){
        return this.valorDepartamento + this.getZona().getPlus();
    }
}
