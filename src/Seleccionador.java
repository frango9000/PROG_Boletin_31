package src;
/**
 * @author fsancheztemprano
 */
public class Seleccionador extends Seleccion{

    public Seleccionador(int id, String nombre, String apellido, int edad) {
        super(id, nombre, apellido, edad);
    }
    
    
    public void seleccionarJugador(){
        System.out.println(nombre + " " + apellido + " selecciona jugador.");
        
    }

}
