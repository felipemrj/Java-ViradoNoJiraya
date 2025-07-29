package aJavaExercícios.bExerciciosPOO.aExercíciosClassesObjetosMetodos.Exercício15.test;

import aJavaExercícios.bExerciciosPOO.aExercíciosClassesObjetosMetodos.Exercício15.domain.Cidade;
import aJavaExercícios.bExerciciosPOO.aExercíciosClassesObjetosMetodos.Exercício15.domain.ImprimeCidade;

public class CidadeTest01 {
    public static void main(String[] args) {
        Cidade cidadeUm = new Cidade();
        Cidade cidadeDois = new Cidade();
        Cidade cidadeTres = new Cidade();
        ImprimeCidade impressora = new ImprimeCidade();

        cidadeUm.nome = "São Paulo";
        cidadeUm.estado = "SP";
        cidadeUm.populacao = 2000000;

        cidadeDois.nome = "Colombo";
        cidadeDois.estado = "PR";
        cidadeDois.populacao = 20000;

        cidadeTres.nome = "Curitiba";
        cidadeTres.estado = "PR";
        cidadeTres.populacao = 2000000;

        impressora.exibeCidade(cidadeUm);
        impressora.exibeCidade(cidadeDois);
        impressora.exibeCidade(cidadeTres);

        System.out.println(cidadeUm.comparaPopulacao(cidadeDois));
        System.out.println(cidadeDois.comparaPopulacao(cidadeTres));
        System.out.println(cidadeUm.comparaPopulacao(cidadeTres));


    }
}
