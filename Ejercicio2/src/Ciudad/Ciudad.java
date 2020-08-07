/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ciudad;
import ObjetoPreciado.*;
import java.util.ArrayList;
import java.util.List;
import ExceptionPersonalizada.*;
/**
 *
 * @author Jose
 */
public class Ciudad {
    private int temperatura;
    private List<ObjetoPreciado> objetos = null;
    
    public Ciudad(int temperatura){
        this.temperatura = temperatura;
        this.objetos = new ArrayList<>();
    }
    
    public int getTemperatura(){
        return this.temperatura;
    }
    
    public void setTemperatura(int temperatura){
        this.temperatura = temperatura;
    }
    
    public List<ObjetoPreciado> getObjetosPreciados(){
        return this.objetos;
    }
    
    public void eliminarObjetoPreciado(ObjetoPreciado obj){
        try{
            if(this.objetos.contains(obj)){
                int index = this.objetos.indexOf(obj);
                this.objetos.remove(index);
            }else{
                throw new ExceptionPersonalizada("dicho elemento no se encontro: "+obj.toString());
            }
        }catch(ExceptionPersonalizada e){
            System.out.println(e.getMessage());
            
        }
    }
    
    
    public void agregarObjetosPreciado(ObjetoPreciado obj){
        try{
            if(!this.objetos.contains(obj)){
                this.objetos.add(obj);
            }else{
                throw new ExceptionPersonalizada("Dicho elemento ya se encuentra en la lista: "+obj.toString());
                
            }
        }catch(ExceptionPersonalizada e){
            System.out.println(e.getMessage());
        }
        
    }

    @Override
    public String toString() {
        return "Ciudad{" + "temperatura=" + this.temperatura + ", objetos=" + this.objetos + '}';
    }
    
}
