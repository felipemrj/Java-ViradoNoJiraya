package aJavaExercícios.bExerciciosPOO.cExercíciosModificadorStatic.Exercício08.domain;

public class ClasseStatic {
    private static int intStatic;

    public static void setIntStatic(int intStatic) {
        ClasseStatic.intStatic = intStatic;
    }

    public static int getIntStatic() {
        return ClasseStatic.intStatic;
    }
}
