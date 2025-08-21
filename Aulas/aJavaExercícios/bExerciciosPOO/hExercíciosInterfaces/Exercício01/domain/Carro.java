package aJavaExercícios.bExerciciosPOO.hExercíciosInterfaces.Exercício01.domain;

public class Carro implements Veiculo {
    @Override
    public void ligar() {
        System.out.println("Carro ligando");
    }

    @Override
    public void desligar() {
        System.out.println("Carro desligando");
    }
}
