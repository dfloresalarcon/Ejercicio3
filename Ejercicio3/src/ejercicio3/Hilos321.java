package ejercicio3;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dfloresalarcon
 */
public class Hilos321 extends Thread {

    private String nombre;

    public Hilos321(String nombre) {
        this.nombre = nombre;
    }

    public Hilos321() {
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            System.out.println("Soy HILO " + this.nombre+" Proceso:: "+(i+1));

            try {
                sleep((long) (Math.random() * (1000 - 500) + 100));
            } catch (InterruptedException ex) {
                Logger.getLogger(Hilos321.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
