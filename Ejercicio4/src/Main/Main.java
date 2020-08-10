/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;


import Adulto.*;
import Barrio.Barrio;
import Elementos.*;
import Legion.Legion;
import Ninio.Ninio;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jose
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Instancia
        List<Ninio> ninios = new ArrayList<>();
        Ninio ninio = new Ninio(3,100);
        Ninio ninio2 = new Ninio(300,200);
        Ninio ninio3 = new Ninio(300,300);
        Ninio ninio4 = new Ninio(100,400);
        Ninio ninio5 = new Ninio(200,500);
        //ninios.add(ninio);
        //ninios.add(ninio2);
        //ninios.add(ninio3);
        Comun adulto = new Comun();
        Terrorifico traje = new Terrorifico();
        Maquillaje maqui = new Maquillaje();
        //Legion legion = new Legion(ninios);
        Barrio barrio1 = new Barrio();
        
        //Operaciones
        barrio1.agregarNinio(ninio);
        barrio1.agregarNinio(ninio2);
        barrio1.agregarNinio(ninio3);
        barrio1.agregarNinio(ninio4);
        ninio2.agregarElemento(traje);
        //ninio.agregarElemento(traje);
        ninio3.agregarElemento(maqui);
        //adulto.agregarNinioQueLoAsusto(ninio2);
        //ninio.asustarA(adulto);
        //legion.agregarMiembro(ninio);
        //legion.agregarMiembro(ninio2);
        ninio.comerCaramelos(110);
        //Listar
        System.out.println(ninio.getCantidadDeCaramelos());
    }
    
}
