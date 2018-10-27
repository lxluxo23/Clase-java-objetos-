
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
       //Estudiante est2 = new Estudiante("99999999", "Luis Yañez2",21 );
       //Estudiante est3 = new Estudiante("11111111", "Luis Yañez3",21 );
       // Implementacion de HashSet
        System.out.println("     HashSet");
        Set<Estudiante> hsEstudiante = new HashSet<>();//HashSet es el  subfuncion de SET
        
        System.out.println("recorriendo Hash");
        
        Iterator iterator = hsEstudiante.iterator();
        
        curso.listar();
        
        
        
        
        
    }
    
}

