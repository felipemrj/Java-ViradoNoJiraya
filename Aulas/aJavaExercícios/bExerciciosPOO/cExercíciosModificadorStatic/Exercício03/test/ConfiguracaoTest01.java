package aJavaExercícios.bExerciciosPOO.cExercíciosModificadorStatic.Exercício03.test;

import aJavaExercícios.bExerciciosPOO.cExercíciosModificadorStatic.Exercício03.domain.Configuracao;

public class ConfiguracaoTest01 {
    public static void main(String[] args) {
        Configuracao.setVersaoApp("v1.0");
        Configuracao.setNomeEmpresa("Informática LTDA.");

        Configuracao c1 = new Configuracao();
        Configuracao c2 = new Configuracao();
        Configuracao c3 = new Configuracao();

        c1.imprime();
        c2.imprime();
        c3.imprime();


    }
}
