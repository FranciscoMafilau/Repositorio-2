package Test;
import herencia.*;
import java.util.Date;
public class TestHerencia {
    public static void main(String[] args) {
        
    Empleado empleado1 = new Empleado(3000,"Alex");
        System.out.println(empleado1);
        
     Empleado empleado2 = new Empleado(3500, "Juan");
        System.out.println(empleado2);
        
     Empleado empleado3 = new Empleado(2800, "Sergio");
        System.out.println(empleado3);
        
        var fecha = new Date();
        Clientes cliente1 = new Clientes(fecha, true, "Maria", 'F', 60, "Rosario");
        System.out.println(cliente1);
        
        Empleado empleado4 = new Empleado(3000, "Atilio");
        System.out.println(empleado4);
        
         Empleado empleado5 = new Empleado(4000, "Dora");
        System.out.println(empleado5);
        
        
         Empleado empleado6 = new Empleado(5000, "Lola");
        System.out.println(empleado6);
        
        System.out.println("***************************");
        
        Clientes cliente8 = new Clientes(fecha, true, "Dorita", 'F', 59, "Santa Fe");
        System.out.println(cliente8);
                
        System.out.println("*****************polimorfismo******************");
        
        Persona persona9 = new Persona("Dona", 'F', 39, "Rosario");
        System.out.println(persona9.obtenerDetalle());
        prueba(persona9);
        
        Empleado empleado10 = new Empleado(6000, "Tito");
        System.out.println(empleado10.obtenerDetalle());
        prueba(empleado10);
        
        Clientes cliente9 = new Clientes(fecha, true, "julia", 'f', 70, "baigorria");
        System.out.println(cliente9.obtenerDetalle());
        prueba(cliente9);
        
        
        System.out.println("************instanceof**********");
        
        determinarTipo(persona9);
       
        
        
        System.out.println("****************convertir objetos***************************");
     ///conversion de objetos de la clase padre a la clase hija DOWNCASTING
     Persona persona22 = new Empleado(5555, "Maya");
        Empleado empleado22 = (Empleado) persona22;
        System.out.println(empleado22.obtenerDetalle());
        
        System.out.println("++++++++++++++++++++++++++++");
        ///conversion de objetos de la clase hija  a la clase padre UPCASTING
        Persona persona2 = empleado22;
        System.out.println(persona22.obtenerDetalle());
    }
    
    public static void prueba(Persona persona) {            //función para trabajar con la clase madre
        System.out.println(persona.obtenerDetalle());
        
        
        System.out.println("**************comparar objetos************************");
        /////voy a la clase persona y creo el método equals
        
          Persona p1 = new Persona("Dona", 'F', 39, "Rosario");
             Persona p2 = new Persona("Dona", 'F', 39, "Rosario");
             
             System.out.println(p1.equals(p2));
             
             System.out.println("***********************");
             
             System.out.println("++++++++++++++hashcode++++++++++++++++++++++");
             ///le da un número distinto a los objetos
             if (p1.hashCode() == p2.hashCode()){
                 System.out.println("son iguales los objetos");
                     }else{
                            System.out.println("no son iguales");
    }
    }

public static void determinarTipo(Object objeto){
    if (objeto instanceof Empleado){
        System.out.println("es de tipo Empleado");
    }else if (objeto instanceof Clientes){
        System.out.println("es de tipo Clientes");
        }else if (objeto instanceof Persona){
            System.out.println("es de tipo Persona");
        }else if (objeto instanceof Object){
            System.out.println("es de tipo Object");
        }
        
    }
}