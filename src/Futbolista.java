package src;
/**
 * @author fsancheztemprano
 */
public class Futbolista extends Seleccion{

    private int dorsal;
    private String demarcacion;

    public Futbolista(int id, String nombre, String apellido, int edad, int dorsal, String demarcacion) {
        super(id, nombre, apellido, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }
    
    private void entrevista(){
        System.out.println(nombre + " " + apellido + " se entrevista.");        
    }

    @Override
    public String toString() {
        return super.toString() + " Futbolista{" + "dorsal=" + dorsal + ", demarcacion=" + demarcacion + '}';
    }
    
    

}
