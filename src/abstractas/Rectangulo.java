
package abstractas;


public class Rectangulo extends FiguraGeometrica{

    public Rectangulo(String tipoFigura) {
        super(tipoFigura);
    }
    
    @Override
    public void dibujar(){///estoy heredando
        System.out.println("Se dibuja un: " +getClass().getSimpleName());
    }
}
