
package modelo;

import java.util.HashSet;
import java.util.Set;

public class Estudiantes {
    private final Set<Estudiante> hsEstudiantes;

    public Estudiantes() {
        
        hsEstudiantes = new HashSet<>();
        
        
    }
    public void agregar(Estudiante e){
        hsEstudiantes.add(e);
        
    }
    
    public void listar(){
        for(Estudiante e : hsEstudiantes){
            System.out.println("hola  :" +e.getNombre()+"  tu edad es  "+e.getEdad());
        }
    }
    
    
}
