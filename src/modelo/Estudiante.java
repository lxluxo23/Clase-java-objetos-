
package modelo;

public class Estudiante {
    private String rut;
    private String nombre;
    private int edad;
    //datos  a solicitar en el ingreso

    public String getRut() {
        return rut;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public Estudiante(String rut, String nombre, int edad) {
        this.rut = rut;
        this.nombre = nombre;
        this.edad = edad;
        //constructor par instanciar los datos de la clase
    }
    
    
    
    
    
}
