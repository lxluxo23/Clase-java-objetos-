
package ejecutora;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import modelo.Estudiante;
import modelo.Estudiantes;
import modelo.Partido;
import modelo.PartidosFutbol;
public class control {
    public static void main(String[] args) {
        /*
      System.out.println("Colecciones SET");
      Estudiantes curso = new Estudiantes();
      curso.agregar(new Estudiante("19474665-2","luis",18));
      System.out.println("recorriendo Hash");
      curso.listar();
        
       */ 
       
        System.out.println("Probando el partido");
        PartidosFutbol partidosfutbol = new PartidosFutbol();
        Partido p1 = new Partido("U. Catolica","U de Shile",(int) (Math.random() * 10),(int) (Math.random() * 10));
        partidosfutbol.agregar(p1);
        
        
        partidosfutbol.agregar(new Partido("colo-colo","Ranges",(int) (Math.random() * 10),(int) (Math.random() * 10)));
        partidosfutbol.agregar(new Partido("evertono","brazil",(int) (Math.random() * 10),(int) (Math.random() * 10)));
        
        partidosfutbol.agregar(p1);
        partidosfutbol.listar();
        
        System.out.println("el arraylist tiene:" +partidosfutbol.contar()+" partidos");
        
        // eliminando elemento en ArrayList
        
        if(partidosfutbol.eliminar(p1)){
            System.out.println("el partido fue eliminado");
        }
        else {
            System.out.println("Error al intentar eliminar");
        }
         partidosfutbol.listar();
         System.out.println("el arraylist tiene:" +partidosfutbol.contar()+" partidos");
        
    }
    
}

