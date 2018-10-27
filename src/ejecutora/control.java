
package ejecutora;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import modelo.Estudiante;
import modelo.Estudiantes;
public class control {
    public static void main(String[] args) {
        
       //Coleccion SET
       System.out.println("Colecciones SET");
       Estudiantes curso = new Estudiantes();
       
       curso.agregar(new Estudiante("19474665-2","luis",18));
       // Implementacion de HashSet
        System.out.println("recorriendo Hash");
        curso.listar();
        
        
        
        
        
    }
    
}

