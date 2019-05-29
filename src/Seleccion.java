package src;

import java.util.ArrayList;

/**
 * @author fsancheztemprano
 */
public abstract class Seleccion implements IntegranteSeleccion{

    protected int id;
    protected String nombre;
    protected String apellido;
    protected int edad;

    public Seleccion(int id, String nombre, String apellido, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return "Seleccion{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + '}';
    }
    

    @Override
    public void concentrarse() {
        System.out.println(nombre + " " + apellido + " se concentra.");
    }

    @Override
    public void viajar() {
        System.out.println(nombre + " " + apellido + " viaja.");
    }

    @Override
    public void entrenar() {
        System.out.println(nombre + " " + apellido + " se entrena.");
    }

    @Override
    public void jugarPartido() {
        System.out.println(nombre + " " + apellido + " juega partido");
    }
    
    public static <E extends Seleccion> void printSeleccion(ArrayList<E> seleccionados){
        for(Seleccion seleccionado : seleccionados){
            System.out.println(seleccionado.toString());
        }        
    }
}
