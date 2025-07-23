package Java02OrientaçãoObjetos.Aula11Métodos.test;

import Java02OrientaçãoObjetos.Aula11Métodos.domain.Estudante;
import Java02OrientaçãoObjetos.Aula11Métodos.domain.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudanteUm = new Estudante();
        Estudante estudanteDois = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudanteUm.nome = "Midoriya";
        estudanteUm.idade = 15;
        estudanteUm.sexo = 'M';

        estudanteDois.nome = "Sakura";
        estudanteDois.idade = 16;
        estudanteDois.sexo = 'F';

        impressora.imprimeEstudante(estudanteUm);
        impressora.imprimeEstudante(estudanteDois);

        impressora.imprimeEstudante(estudanteUm);
        impressora.imprimeEstudante(estudanteDois);
    }
}
