package padoresjava.singleton;

/**
 *  *
 * Exemplo de Singleton Apressado
 *  @author GabrielaHijjar
 *
 */

public class SingletonEager {

    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager() {
        super ();

    }

    public static SingletonEager getInstancia(){

        return instancia;
    }
}
