
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
    public int contar(){
        return alpartidoFutbol.size();
    }
    
    public void listar(){
        for(Partido p : alpartidoFutbol){
            System.out.println(
             "equipo local: "+p.getEquipolocal()+
             "|equipo visita: "+p.getEquipovisitante()+
             "| Goles equipo local: "+p.getGoleslocal()+
             "| goles equipo visita: "+p.getGolesvisitantes());
        }
    }
    
}
