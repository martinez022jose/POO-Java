/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExceptionPersonalizada;

/**
 *
 * @author Jose
 */
public class ExceptionPersonalizada extends Exception{
    
    private static final long serialVersionUID = 700L;
    
    public ExceptionPersonalizada(String mensaje){
        super(mensaje);
    }
}
