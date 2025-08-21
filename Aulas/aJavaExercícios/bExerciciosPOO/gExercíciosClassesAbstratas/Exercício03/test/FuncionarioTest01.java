package aJavaExercícios.bExerciciosPOO.gExercíciosClassesAbstratas.Exercício03.test;

import aJavaExercícios.bExerciciosPOO.gExercíciosClassesAbstratas.Exercício03.domain.FuncionarioCLT;
import aJavaExercícios.bExerciciosPOO.gExercíciosClassesAbstratas.Exercício03.domain.FuncionarioPJ;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        FuncionarioPJ pj = new FuncionarioPJ(2000);
        FuncionarioCLT clt = new FuncionarioCLT(2000);

        System.out.println(pj);
        System.out.println(clt);
    }
}
