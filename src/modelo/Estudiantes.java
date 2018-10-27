
package modelo;

import java.util.HashSet;
import java.util.Set;

public class Estudiantes {
    private Set<Estudiante> hsEstudiantes;

    public Estudiantes() {
        
        hsEstudiantes = new HashSet<Estudiante>();
        
        
    }
    public void agregar(Estudiante e){
        hsEstudiantes.add(e);
        
    }
    
    public void listar(){
        for (Estudiante e: hsEstudiantes){
            System.out.println("");
        }
    }
    
    
}
