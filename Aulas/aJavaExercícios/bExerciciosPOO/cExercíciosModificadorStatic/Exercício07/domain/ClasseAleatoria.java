package aJavaExercícios.bExerciciosPOO.cExercíciosModificadorStatic.Exercício07.domain;

public class ClasseAleatoria {
    static {
        System.out.println("bloco estático 1");
    }

    public ClasseAleatoria() {
        System.out.println("objeto instanciado");
    }

    {
        System.out.println("dentro bloco não estático");
    }

    static  {
        System.out.println("bloco estático 2");
    }
}
