package aJavaExercícios.bExerciciosPOO.aExercíciosClassesObjetosMetodos.Exercício06.domain;

public class Mensagem {
    public void exibirMensagem(String nome) {
        System.out.println("Olá, " + nome + "!");
    }

    public void exibirMensagemComPrefixo(String prefixo, String nome) {
        if (nome.isEmpty()) {
            return;
        }
        System.out.println("Olá " + prefixo + " " + nome);
    }
}
