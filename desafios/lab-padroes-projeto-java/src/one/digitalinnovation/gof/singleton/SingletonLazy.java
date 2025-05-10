package one.digitalinnovation.gof.singleton;

/**
 * Singleton "preguiçoso"
 *
 * @author JoaoV-A01
 */
public class SingletonLazy {

    private static SingletonLazy istancia;

    private SingletonLazy() {
        super();
    }

    public static SingletonLazy getInstancia() {
        if (istancia == null) {
            istancia = new SingletonLazy();
        }
        return istancia;
    }
}
