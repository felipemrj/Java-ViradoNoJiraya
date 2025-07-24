package cJavaOrientaçãoObjetos.Aula11Métodos.test;

import cJavaOrientaçãoObjetos.Aula11Métodos.domain.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudanteUm = new Estudante();
        Estudante estudanteDois = new Estudante();

        estudanteUm.nome = "Midoriya";
        estudanteUm.idade = 15;
        estudanteUm.sexo = 'M';

        estudanteDois.nome = "Sakura";
        estudanteDois.idade = 16;
        estudanteDois.sexo = 'F';

        estudanteUm.imprime();
        estudanteDois.imprime();
    }
}
