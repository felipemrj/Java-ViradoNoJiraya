package aJavaExercícios.bExerciciosPOO.iExercíciosPolimorfismo.Exercício02.test;

import aJavaExercícios.bExerciciosPOO.iExercíciosPolimorfismo.Exercício02.domain.Salvavel;

public class RepositorioBancoDeDados implements Salvavel {
    @Override
    public void salvar() {
        System.out.println("Salvando em banco de dados");
    }
}
