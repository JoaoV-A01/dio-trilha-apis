package one.digitalinnovation.gof.singleton;

/// Singleton "Lazy Holder"
///
/// @see <a href="https://stackoverflow.com/a/24018148">Referencia</a>
///
/// @author JoaoV-A01
public class SingletonLazyHolder {

    private static class InstanceHolder {
        public static SingletonLazyHolder istancia = new SingletonLazyHolder();

    }

    private SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstancia() {

        return InstanceHolder.istancia;
    }
}
