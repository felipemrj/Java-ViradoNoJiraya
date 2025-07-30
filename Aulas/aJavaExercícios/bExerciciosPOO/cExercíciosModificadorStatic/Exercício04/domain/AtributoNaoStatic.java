package aJavaExercícios.bExerciciosPOO.cExercíciosModificadorStatic.Exercício04.domain;

public class AtributoNaoStatic {

    private String atributoNaoStatic;

    public static void acessaNaoStatic() {
        // System.out.println(AtributoNaoStatic.atributoNaoStatic);
    }
    // Erro:
    // java: non-static variable atributoNaoStatic cannot be referenced from a static context
    // Não podemos acessar um atributo que não seja static usando um método static, pois atributos não-static
    // não existem sem um objeto instanciado. Para corrigir esse erro precisamos que o atributo seja do tipo static
}
