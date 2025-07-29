package aJavaExercícios.bExerciciosPOO.aExercíciosClassesObjetosMetodos.Exercício06.test;

import aJavaExercícios.bExerciciosPOO.aExercíciosClassesObjetosMetodos.Exercício06.domain.Mensagem;

public class MensagemTest01 {
    public static void main(String[] args) {
        Mensagem mensagem = new Mensagem();
        String nome;

        nome = "Felipe";
        mensagem.exibirMensagem(nome);

        nome = "Thamyres";
        mensagem.exibirMensagem(nome);

        mensagem.exibirMensagem("Wagner");

        mensagem.exibirMensagemComPrefixo("Sr", "Felipe");
    }
}
