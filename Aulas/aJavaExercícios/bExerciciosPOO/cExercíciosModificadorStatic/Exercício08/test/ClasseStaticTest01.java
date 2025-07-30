package aJavaExercícios.bExerciciosPOO.cExercíciosModificadorStatic.Exercício08.test;

import aJavaExercícios.bExerciciosPOO.cExercíciosModificadorStatic.Exercício08.domain.ClasseStatic;

public class ClasseStaticTest01 {
    public static void main(String[] args) {
        ClasseStatic.setIntStatic(10);
        System.out.println(ClasseStatic.getIntStatic());
    }

    // Para acessarmos atributos estáticos a partir de um método estático não utilizamos o comando this. que faz referência ao atributo
    // instanciado por um objeto. Para acessarmos o atributo static usamos NomeDaClasse. ou apenas o nome do atributo
}
