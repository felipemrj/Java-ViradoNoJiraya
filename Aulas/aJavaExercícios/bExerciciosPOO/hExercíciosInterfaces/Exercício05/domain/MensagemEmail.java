package aJavaExercícios.bExerciciosPOO.hExercíciosInterfaces.Exercício05.domain;

public class MensagemEmail implements Mensagem {
    @Override
    public void getMensagem() {
        System.out.println("Mensagem Email");
    }
}
