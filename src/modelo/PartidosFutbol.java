
package modelo;

import java.util.ArrayList;
import java.util.List;


public class PartidosFutbol {
    
     private final List<Partido> alpartidoFutbol;

    public PartidosFutbol() {
        
        alpartidoFutbol = new ArrayList<>();
        
        
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
    public boolean eliminar (Partido p){
       return alpartidoFutbol.remove(p);
    }
}
