
package enumeraciones;


public enum Continentes {
    AFRICA (54),        ///para enumerar utilizo las comas y finalizo con un punto y coma
    EUROPA(50),
    ASIA (48),
    AMERICA (35),
    OCEANIA (14);
    ///creamos un atributo final
    private final int paises;
    
    private Continentes(int paises){ ///creamos un constructor
        this.paises = paises;
    }
    
    public int getPaises(){ ///creamos un método get
        return this.paises;
    }
}
