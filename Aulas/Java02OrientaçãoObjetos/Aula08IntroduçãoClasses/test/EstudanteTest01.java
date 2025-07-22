package Java02OrientaçãoObjetos.Aula08IntroduçãoClasses.test;

import Java02OrientaçãoObjetos.Aula08IntroduçãoClasses.domain.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "Felipe";
        estudante.sexo = 'M';
        estudante.idade = 30;
    }
}
