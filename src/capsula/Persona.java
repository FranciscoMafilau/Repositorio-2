
package capsula;

public class Persona {
    private String nombre;
    private int edad;
    private boolean eliminado;

    public Persona(String nombre, int edad, boolean eliminado) {
        this.nombre = nombre;
        this.edad = edad;
        this.eliminado = eliminado;
    }
    public String getNombre(){
        return this.nombre;
         }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public int getEdad(){
        return this.edad ;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public boolean isEliminado(){
        return this.eliminado;
    }
    public void setEliminado(boolean eliminado){
        this.eliminado = eliminado;
    }

    
   
    @Override ////esto es un anotador
    
     //ponemos toString y modificamos el objeto. Borramos super.tostring(formatear
    public String toString() {
        return "Persona: [Nombre: %s, Edad: %d, Eliminado: %b] "
                .formatted(this.nombre, this.edad, this.eliminado); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
}
