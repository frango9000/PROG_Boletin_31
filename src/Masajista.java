package src;
/**
 * @author fsancheztemprano
 */
public class Masajista extends Seleccion{
    private String titulacion;
    private int aniosExperiencia;

    public Masajista(int id, String nombre, String apellido, int edad, String titulacion, int aniosExperiencia) {
        super(id, nombre, apellido, edad);
        this.titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;
    }

    public void darMasaje(){
        System.out.println(nombre + " " + apellido + " da masaje.");
        
    }

    @Override
    public String toString() {
        return super.toString() + " Masajista{" + "titulacion=" + titulacion + ", aniosExperiencia=" + aniosExperiencia + '}';
    }

}
