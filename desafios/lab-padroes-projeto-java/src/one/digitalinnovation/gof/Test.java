package one.digitalinnovation.gof;

public class Test {
    public static void main(String[] args) {
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy.toString());
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy.toString());

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager.toString());
        eager = SingletonEager.getInstancia();
        System.out.println(eager.toString());

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder.toString());
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder.toString());
    }
}
