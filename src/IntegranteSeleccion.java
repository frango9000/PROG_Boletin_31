package src;
//@author fsancheztemprano
public interface IntegranteSeleccion {
    
    public void concentrarse();
    
    public void viajar();
    
    public void entrenar();
    
    public void jugarPartido();
    
    public default void ruedaPrensa(){
        System.out.println("Rueda de Prensa");
    }
    
    public default void videoPublicitario(){
        System.out.println("Video Publicitario");
    }
    
}