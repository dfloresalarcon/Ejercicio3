
package ejercicio3;

/**
 *
 * @author dfloresalarcon
 */
public class Ejercicio3 {

    public static void main(String[] args) throws InterruptedException {
        
        Hilos321 h1 = new Hilos321("hilo1");
        Hilos321 h2 = new Hilos321("hilo2");
        Hilos321 h3 = new Hilos321("hilo3");
        
        h3.start();
        h3.join();
        
        h2.start();
        h2.join();
        
        h1.start();
        h1.join();
        
        
     
        
        System.out.println("----Finalizado----");
    }
    
}
