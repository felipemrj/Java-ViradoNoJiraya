package aJavaExercícios.bExerciciosPOO.aExercíciosClassesObjetos.Exercício20.test;

import aJavaExercícios.bExerciciosPOO.aExercíciosClassesObjetos.Exercício20.domain.Contato;
import aJavaExercícios.bExerciciosPOO.aExercíciosClassesObjetos.Exercício20.domain.ImprimeContato;

public class ContatoTest01 {
    public static void main(String[] args) {
        Contato contatoUm = new Contato();
        Contato contatoDois = new Contato();
        ImprimeContato impressora = new ImprimeContato();


        contatoUm.nome = "Felipe";
        contatoUm.telefone = "1120168876";
        contatoUm.email = "felipe@email.com";

        contatoDois.nome = "Thamyres";
        contatoDois.telefone = "4198765543";
        contatoDois.email = "thamyres@email.com";

        impressora.exibeContato(contatoUm);
        impressora.exibeContato(contatoDois);


    }
}
