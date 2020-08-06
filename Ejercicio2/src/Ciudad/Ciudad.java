/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ciudad;

/**
 *
 * @author Jose
 */
public class Ciudad {
    private int temperatura;
    
    public Ciudad(int temperatura){
        this.temperatura = temperatura;
    }
    
    public int getTemperatura(){
        return this.temperatura;
    }
    
    public void setTemperatura(int temperatura){
        this.temperatura = temperatura;
    }
}
