
package Test;
import capsula.Persona;

public class TestPersona {
    public static void main(String[] args) {
        
        Persona persona1= new Persona("Martina", 17, false);
        
        String estado = persona1.toString();
        System.out.println(estado);
        
        System.out.println(persona1.getNombre());
        persona1.setNombre("Tata");
     
        
        persona1.setEdad(18);
        System.out.println(persona1.getEdad());
        
        System.out.println(persona1);
    }
}
