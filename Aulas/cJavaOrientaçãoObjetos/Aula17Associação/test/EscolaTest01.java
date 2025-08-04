package cJavaOrientaçãoObjetos.Aula17Associação.test;

import cJavaOrientaçãoObjetos.Aula17Associação.domain.Escola;
import cJavaOrientaçãoObjetos.Aula17Associação.domain.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Theobaldo");
        Professor professor2 = new Professor("Theobaldo");
        Professor[] professores = {professor1, professor2};
        Escola escola = new Escola("Nuvem", professores);

        escola.imprime();


    }
}
