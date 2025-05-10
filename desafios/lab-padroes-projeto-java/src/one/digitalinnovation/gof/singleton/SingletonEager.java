package one.digitalinnovation.gof.singleton;

/**
 * Singleton "apressado"
 *
 * @author JoaoV-A01
 */
public class SingletonEager {

    private static SingletonEager istancia = new SingletonEager();

    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstancia() {

        return istancia;
    }
}
