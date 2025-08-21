package aJavaExercícios.bExerciciosPOO.gExercíciosClassesAbstratas.Exercício05.domain;

public class Moto extends Veiculo {
    private final double CAPACIDADE_TANQUE = 100;

    public Moto(String marca, String modelo, double tanque) {
        super(marca, modelo, tanque);
    }

    @Override
    public void abastecer(double litros) {
        if (litros > CAPACIDADE_TANQUE || litros > (CAPACIDADE_TANQUE - getTanque())) {
            return;
        }
        setTanque(litros + getTanque());
    }
}
