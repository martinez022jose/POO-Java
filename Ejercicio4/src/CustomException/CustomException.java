/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CustomException;

/**
 *
 * @author Jose
 */
public class CustomException extends Exception{
    
    public CustomException(String mensaje){
        super(mensaje);
    }
}
