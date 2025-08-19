package aJavaExercícios.bExerciciosPOO.eExercíciosHerança.Exercício02.domain;

public class Moto extends Veiculo {
    public String cilindradas;

    public Moto(String marca, String modelo, String cilindradas) {
        super(marca, modelo);
        this.cilindradas = cilindradas;
    }

    @Override
    public void imprime() {
        super.imprime();
        System.out.println("Cilindradas: " + this.cilindradas);
    }
}
