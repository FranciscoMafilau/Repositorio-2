package Clases;

public class Persona {
    public String nombre;
    public int edad;
    
    public Persona(){ //constructor
        System.out.println("construyendo el objeto");
    }
    
    public Persona(String nombre){
        System.out.println("hola "+nombre+" desde el constructor");
        
    }
    public void mostrarDatos(){ //el void simplemente muestra los datos
        
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        
    }

    }
    

