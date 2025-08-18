package cJavaOrientaçãoObjetos.Aula18Herança.test;

import cJavaOrientaçãoObjetos.Aula18Herança.domain.Funcionario;

public class HerancaTest02 {
    /*
     * 0 - Bloco de inicialização estático da superclasse é executado quando a JVM carregar a superclasse
     * 1 - Bloco de inicialização estático da subclasse é executado quando a JVM carregar a classe filha
     * 2 - Alocado espaço em memória pro objeto da superclasse
     * 3 - Cada atributo da classe é criado e inicializado com valores default ou o que for passado da superclasse
     * 4 - Bloco de inicialização da superclasse é executado na ordem em que aparece
     * 5 - Construtor da superclasse é executado
     * 6 - Alocado espaço em memória pro objeto da subclasse
     * 7 - Cada atributo da classe é criado e inicializado com valores default ou o que for passado da subclasse
     * 8 - Bloco de inicialização da subclasse é executado na ordem em que aparece
     * 9 - Construtor da subclasse é executado */

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Josué");
    }
}
