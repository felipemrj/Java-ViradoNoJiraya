package aJavaExercícios.bExerciciosPOO.eExercíciosHerança.Exercício03.domain;

public class Guerreiro extends Personagem {
    private String arma;

    public Guerreiro(double vida, double poder, String arma) {
        super(vida, poder);
        this.arma = arma;
    }

    @Override
    public void imprime() {
        super.imprime();
        System.out.println("Arma: " + this.arma);
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }
}
