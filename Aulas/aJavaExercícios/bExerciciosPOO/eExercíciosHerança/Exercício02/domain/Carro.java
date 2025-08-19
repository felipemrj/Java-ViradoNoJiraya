package aJavaExercícios.bExerciciosPOO.eExercíciosHerança.Exercício02.domain;

public class Carro extends Veiculo {
    private String capacidadeMotor;

    public Carro(String marca, String modelo, String capacidadeMotor) {
        super(marca, modelo);
        this.capacidadeMotor = capacidadeMotor;
    }

    @Override
    public void imprime() {
        super.imprime();
        System.out.println("Capacidade motor: " + capacidadeMotor + "L");
    }
}
