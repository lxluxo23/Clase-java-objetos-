
package ejecutora;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import modelo.Estudiante;
public class control {
    public static void main(String[] args) {
        
       //Coleccion SET
       System.out.println("Colecciones SET");
       Estudiante est = new Estudiante("195980101", "Luis Yañez",21 );
       Estudiante est2 = new Estudiante("99999999", "Luis Yañez2",21 );
       Estudiante est3 = new Estudiante("11111111", "Luis Yañez3",21 );
       // Implementacion de HashSet
        System.out.println("     HashSet");
        Set<Estudiante> hsEstudiante = new HashSet<>();//HashSet es el  subfuncion de SET
        
        System.out.println("recorriendo Hash");
        
        Iterator iterator = hsEstudiante.iterator();
        
        
        
        
    }
    
}

