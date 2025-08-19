package aJavaExercícios.bExerciciosPOO.eExercíciosHerança.Exercício03.domain;

public class Personagem {
    public double vida;
    public double poder;

    public Personagem(double vida, double poder) {
        this.vida = vida;
        this.poder = poder;
    }

    public void imprime() {
        System.out.println("Vida: " + this.vida);
        System.out.println("Poder: " + this.poder);
    }

    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }

    public double getPoder() {
        return poder;
    }

    public void setPoder(double poder) {
        this.poder = poder;
    }
}
