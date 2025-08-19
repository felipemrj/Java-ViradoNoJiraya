package aJavaExercícios.bExerciciosPOO.eExercíciosHerança.Exercício03.domain;

public class Mago extends Personagem {
    public String magia;

    public Mago(double vida, double poder, String magia) {
        super(vida, poder);
        this.magia = magia;
    }

    @Override
    public void imprime() {
        super.imprime();
        System.out.println("Magia: " + this.magia);
    }

    public String getMagia() {
        return magia;
    }

    public void setMagia(String magia) {
        this.magia = magia;
    }
}
