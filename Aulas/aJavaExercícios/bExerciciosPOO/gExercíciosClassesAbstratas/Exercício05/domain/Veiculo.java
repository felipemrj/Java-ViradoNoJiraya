package aJavaExercícios.bExerciciosPOO.gExercíciosClassesAbstratas.Exercício05.domain;

public abstract class Veiculo {
    private String marca;
    private String modelo;
    private double tanque;

    public Veiculo(String marca, String modelo, double tanque) {
        this.marca = marca;
        this.modelo = modelo;
        this.tanque = tanque;
    }

    public abstract void abastecer(double litros);

    @Override
    public String toString() {
        return "Veiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", tanque=" + tanque +
                '}';
    }

    public double getTanque() {
        return tanque;
    }

    public void setTanque(double tanque) {
        this.tanque = tanque;
    }
}
