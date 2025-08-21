package aJavaExercícios.bExerciciosPOO.hExercíciosInterfaces.Exercício05.domain;

public class MensagemTest01 {
    public static void main(String[] args) {
        MensagemTexto msgtxt = new MensagemTexto();
        MensagemEmail msgemail = new MensagemEmail();

        msgtxt.getMensagem();
        msgemail.getMensagem();
    }
}
