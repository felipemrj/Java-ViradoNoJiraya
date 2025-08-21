package aJavaExercícios.bExerciciosPOO.hExercíciosInterfaces.Exercício05.domain;

public class MensagemTexto implements Mensagem {
    @Override
    public void getMensagem() {
        System.out.println("Mensagem de Texto");
    }
}
