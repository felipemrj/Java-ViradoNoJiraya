package aJavaExercícios.bExerciciosPOO.hExercíciosInterfaces.Exercício01.domain;

public class Motocicleta implements Veiculo {
    @Override
    public void ligar() {
        System.out.println("Moto ligando");
    }

    @Override
    public void desligar() {
        System.out.println("Moto desligando");
    }
}
