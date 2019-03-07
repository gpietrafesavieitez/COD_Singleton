/**
 * Gabriel P.
 * CPR Daniel Castelao
 * <gpietrafesavieitez@danielcastelao.org>
 */

package singleton;

public class Singleton {
    private String nombre;
    private int edad;
    private static Singleton instancia;
    
    private Singleton(){
    }
    
    public static Singleton getInstance(){
        if(instancia == null){
            instancia = new Singleton();
        }
        return instancia;
    }
    
    private Singleton(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public static Singleton getInstance(String nombre, int edad){
        if(instancia == null){
            instancia = new Singleton(nombre, edad);
        }
        return instancia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public static Singleton getInstancia() {
        return instancia;
    }

    public static void setInstancia(Singleton instancia) {
        Singleton.instancia = instancia;
    }

    @Override
    public String toString() {
        return "Singleton{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }
}