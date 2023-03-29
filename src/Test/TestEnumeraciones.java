
package Test;

import enumeraciones.*;



public class TestEnumeraciones {
    public static void main(String[] args) {
        System.out.println(DiasDeLaSemana.DOMINGO);
        System.out.println(DiasDeLaSemana.LUNES);
        
        System.out.println(Continentes.AMERICA);
        System.out.println(Continentes.AMERICA.getPaises());
        
        
        System.out.println("********como una variable**************");
        Continentes continente = Continentes.AMERICA; ////lo hacemos como una variable
        System.out.println(continente.getPaises());
    }
}
