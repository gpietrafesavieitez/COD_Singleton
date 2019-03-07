/**
 * Gabriel P.
 * CPR Daniel Castelao
 * <gpietrafesavieitez@danielcastelao.org>
 */

package singleton;

public class Main {

    public static void main(String[] args) {
        // No se puede instanciar directamente porque el constructor en un Singleton es privado
        // Singleton obj1 = new Singleton();
        
        // Creamos instancia sin parametros, añadimos luego datos
        Singleton objA1 = Singleton.getInstance();
        objA1.setNombre("gabriel");
        objA1.setEdad(23);
        System.out.println(objA1.toString());
        
        // Creamos instancia con parametros directamente
        Singleton objA2 = Singleton.getInstance("gabriel",23);
        System.out.println(objA2);
        
        // Usando SingletonHolder
        OtroSingleton objB1 = OtroSingleton.getInstance();
        objB1.setNombre("gabriel");
        objB1.setEdad(23);
        System.out.println(objB1.toString());
    }
}
