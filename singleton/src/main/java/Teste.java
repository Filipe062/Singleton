import facade.Facade;
import gof.SingletonEager;
import gof.SingletonLazy;
import gof.SingletonLazyHolder;
import strategy.*;

public class Teste {
    public static void main(String[] args) {
        //Singleton

        SingletonLazy lazy = SingletonLazy.getInstance();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstance();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);

        //Strategy

        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);

        robo.mover();
        robo.mover();

        //facede

        Facade facade = new Facade();
        facade.migraCliente("Venilton","14801788");
    }

}
