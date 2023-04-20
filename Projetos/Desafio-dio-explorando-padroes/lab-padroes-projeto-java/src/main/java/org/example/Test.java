package org.example;

import org.example.facade.Facade;
import org.example.singleton.SingletonEager;
import org.example.singleton.SingletonLazy;
import org.example.singleton.SingletonLazyHolder;
import org.example.strategy.ComportamentoAgressivo;
import org.example.strategy.ComportamentoDefensivo;
import org.example.strategy.ComportamentoNormal;
import org.example.strategy.Robo;

public class Test {
    public static void main(String[] args) {
        //Singleton

        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);

        //Strategy

        ComportamentoNormal normal = new ComportamentoNormal();
        ComportamentoDefensivo defensivo = new ComportamentoDefensivo();
        ComportamentoAgressivo agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();

        //Facade

        Facade facade = new Facade();
        facade.migrarCliente("Venilton", "14870-000");

    }
}
