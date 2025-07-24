package aJavaExercícios.bExerciciosPOO.aExercíciosClassesObjetos.Exercício20.test;

import aJavaExercícios.bExerciciosPOO.aExercíciosClassesObjetos.Exercício20.domain.Agenda;
import aJavaExercícios.bExerciciosPOO.aExercíciosClassesObjetos.Exercício20.domain.ImprimeAgenda;

import javax.swing.*;

public class AgendaTest01 {
    public static void main(String[] args) {
        Agenda contatoUm = new Agenda();
        Agenda contatoDois = new Agenda();
        ImprimeAgenda impressora = new ImprimeAgenda();


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
