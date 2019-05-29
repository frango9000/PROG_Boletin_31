package src;
/**
 * @author fsancheztemprano
 */
public class Entrenador extends Seleccion{

    private int idFederacion;

    public Entrenador(int id, String nombre, String apellido, int edad, int idFederacion) {
        super(id, nombre, apellido, edad);
        this.idFederacion = idFederacion;
    }
    
    
    private void planificarEntrenamiento(){
        System.out.println(nombre + " " + apellido + " planifica entrenamiento.");
        
    }

    @Override
    public String toString() {
        return super.toString() + " Entrenador{" + "idFederacion=" + idFederacion + '}';
    }

    
    
}
