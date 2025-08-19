package cJavaOrientaçãoObjetos.Aula20ModificadorFinal.test;

import cJavaOrientaçãoObjetos.Aula20ModificadorFinal.domain.Carro;
import cJavaOrientaçãoObjetos.Aula20ModificadorFinal.domain.Ferrari;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro c = new Carro();

        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(c.COMPRADOR);
        c.COMPRADOR.setNome("Felipe");
        System.out.println(c.COMPRADOR);

        Ferrari f = new Ferrari();
        f.setNome("Enzo");
        f.imprime();
    }
}
