
import Clases.Persona;
import Clases.Calculadora;
import Clases.Rectangulos;





public class Main {
    public static void main(String[] args) {
        
       
        
         Persona persona1;
        persona1 = new Persona();
        
        persona1.nombre = "Francisco";
        persona1.edad = 49;
        persona1.mostrarDatos();
        
        Persona persona2 = new Persona();
        persona2.nombre= "Lautaro";
        persona2.edad= 12;
        persona2.mostrarDatos();
        
        System.out.println(Calculadora.PI);
        System.out.println(Calculadora.sumar(20,30));
        
        
         Calculadora calcular = new Calculadora();
         System.out.println(calcular.resta(20, 15));
         System.out.println(calcular.resta(20.2, 15.3));
     
         Rectangulos r1 = new Rectangulos();
         System.out.println(r1.area(6, 8));
         System.out.println(r1.Perimetro(7, 5));
    }
   
}
