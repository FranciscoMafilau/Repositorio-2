package herencia;


public class Empleado extends Persona { ///con extends vamos a heredar desde Persona
    //usamos private por que no lo van a usar otras clases
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleado;

    public Empleado(double sueldo, String nombre) { ///genero constructor -- borro solamente idEmpleado porque lo manejo internamente
        super(nombre);  //super manda el nombre a superclase
        this.idEmpleado = ++Empleado.contadorEmpleado;
        this.sueldo = sueldo;
    }

    public int getIdEmpleado() {
        return this.idEmpleado;
    }

    

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String obtenerDetalle() {
        return super.obtenerDetalle() + "sueldo:"  + this.sueldo; //polimofismo, agregamos otro comportamiento
    }

    
    
    
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado{");
        sb.append("idEmpleado=").append(this.idEmpleado);
        sb.append(", sueldo=").append(this.sueldo);
        sb.append(" ; ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }

  
    }
    
    
    

