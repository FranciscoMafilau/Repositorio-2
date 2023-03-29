
package abstractas;

public class Cuadrado extends FiguraGeometrica{

    public Cuadrado(String tipoFigura) {
        super(tipoFigura);
    }

    @Override////implementamos el metodo dibujar
    public void dibujar() {
        System.out.println("se dibuja un " + this.getClass().getSimpleName());
        }
    
    
    
}
