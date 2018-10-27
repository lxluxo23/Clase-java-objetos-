
package modelo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class PartidosFutbol {
    
     private List<Partido> alpartidoFutbol;

    public PartidosFutbol() {
        
        alpartidoFutbol = new ArrayList<Partido>();
        
        
    }
    public void agregar(Partido p){
        alpartidoFutbol.add(p);
        
    }
    
    public void listar(){
        for(Partido e : alpartidoFutbol){
            System.out.println("hola  :" +e.getNombre()+"  tu edad es  "+e.getEdad());
        }
    }
    
}
